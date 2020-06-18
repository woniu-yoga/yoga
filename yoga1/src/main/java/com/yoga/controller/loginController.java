package com.yoga.controller;

import com.yoga.entity.Userinfo;
import com.yoga.mapper.CountryMapper;
import com.yoga.service.IUserinfoService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/login")
public class loginController {
    @Resource
    private IUserinfoService userinfoService;
    @PostMapping("/save")
    public void save(Userinfo info,HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Cache-Control","no-cache");
        System.out.println("++++++++++++++++++++");

        userinfoService.insert(info);
    }
    @Resource
    private CountryMapper countryMapper;
    @GetMapping("/country")
    public List countrys(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Cache-Control","no-cache");
        return countryMapper.FindAllCountry();
    }
    @PostMapping("/login")
    public String login(Userinfo info, ModelMap map) {
        System.out.println(info.getUname()+"----"+info.getUpass());
        Subject currentUser = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(info.getUname(), info.getUpass());
        System.out.println(token);
        // token.setRememberMe(true);
        try {
            currentUser.login(token);
            return "redirect:/admin/index.jsp";
        } catch (UnknownAccountException ae) {
            map.put("error","没有当前账户");
            return "/index";
        }catch (IncorrectCredentialsException ae) {
            map.put("error","密码不正确");
            return "/index";
        } catch (Exception ae) {
            map.put("error","登录失败：" + ae);
            return "/index";
        }
    }
    @RequestMapping("logout")
    public String logout() {
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.logout();
        return "/index";
    }
    @PostMapping("registered")
    public void registered(Userinfo userinfo){
        userinfoService.save(userinfo);
    }

}
