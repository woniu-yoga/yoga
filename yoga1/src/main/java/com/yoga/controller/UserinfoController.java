package com.yoga.controller;

import com.yoga.entity.Myfriend;
import com.yoga.entity.Userinfo;
import com.yoga.service.IUserinfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author bai
 * @create 2020-06-09-下午 11:54
 */
@RestController
@RequestMapping("userinfo")
public class UserinfoController {
    @Resource
    private IUserinfoService userinfoService;

    @GetMapping("findAll")
    public List<Userinfo> findAll(){
        return userinfoService.findAll();
    }

    @GetMapping("findById")
    public Userinfo findById(Userinfo userinfo){
        return userinfoService.findById(userinfo.getUid());
    }

    @PostMapping("save")
    public void save(Userinfo userinfo){
        userinfoService.save(userinfo);
    }
    @PostMapping("update")
    public void update(Userinfo userinfo){
        userinfoService.update(userinfo);
    }

    @GetMapping("getFriends")
    public List<Myfriend> getFriends(){
        return null;
    }
}
