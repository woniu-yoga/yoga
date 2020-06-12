package com.yoga.controller;

import com.yoga.entity.Userinfo;
import com.yoga.service.IUserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class adminController {
    @Resource
    private IUserinfoService userinfoServiceImpl;

    /**
     * 查询所有的用户信息并且返回
     * @return
     */
    @GetMapping("list")
    public List<Userinfo> list(){
        return userinfoServiceImpl.findAll();
    }

    /**
     * 此处删除为伪删除，以便于保存用户数据
     * 故此处照样采用update操作
     * @param userinfo
     */
    @GetMapping("delete")
    public void delete(Userinfo userinfo){
        userinfoServiceImpl.update(userinfo);
    }

    /**
     * 更新 根据主键 为空的字段不更新
     * @param userinfo
     */
    @GetMapping("update")
    public void update(Userinfo userinfo){
        userinfoServiceImpl.update(userinfo);
    }
}
