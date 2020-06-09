package com.yoga.shiro;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yoga.entity.Role;
import com.yoga.entity.Tree;
import com.yoga.entity.Userinfo;
import com.yoga.service.IUserinfoService;
import lombok.SneakyThrows;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
@Component
public class MyRealm extends AuthorizingRealm {
    @Resource
    private IUserinfoService userinfoServiceImpl;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String uname = principalCollection.getPrimaryPrincipal().toString();
        Userinfo info = userinfoServiceImpl.loginin(uname);
        //根据用户名查询数据库得到你应该有的权限  并且设置 就ok啦。
        List<String> permissions = new ArrayList<String>();

        List<Tree> trees = info.getTrees();
        for (Tree tree : trees) {
            if(tree.getUrl()!=null){
                String file = tree.getUrl();//  /admin/userinfo/index.jsp
                file = file.substring(0, file.lastIndexOf("/")+1); //    /admin/userinfo/
                permissions.add(file+":**");   ////permissions.add("/admin/userinfo/:**");
            }
        }

        SimpleAuthorizationInfo sai = new SimpleAuthorizationInfo();

        List<Role> roles = info.getRoles();
        for (Role role : roles) {
            sai.addRole(role.getRolename());
        }

        sai.addStringPermissions(permissions);

        return sai;
    }

    @SneakyThrows
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String uname = authenticationToken.getPrincipal().toString();
        Userinfo info = userinfoServiceImpl.loginin(uname);
        if(info==null){
            throw new UnknownAccountException();
        }else{
            //把json交给页面
            List<Tree> trees = info.getTrees();
            Tree tree = new Tree(99999, "注销", "/admin/logout", null);
            trees.add(tree);

            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writeValueAsString(trees);

            HttpServletRequest request= ((ServletRequestAttributes)(RequestContextHolder.currentRequestAttributes())).getRequest();
            request.getSession().setAttribute("json", json);
        }


        SimpleAuthenticationInfo sai = new SimpleAuthenticationInfo(info.getUname(),info.getUpass(),getName());

        return sai;
    }
}
