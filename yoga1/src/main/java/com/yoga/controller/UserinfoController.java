package com.yoga.controller;

import com.yoga.entity.Myfriend;
import com.yoga.entity.Userinfo;
import com.yoga.service.IMyFocusService;
import com.yoga.service.IMyFriendService;
import com.yoga.service.IUserinfoService;
import jdk.nashorn.internal.objects.annotations.Getter;
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
    @Resource
    private IMyFriendService myFriendService;
    @Resource
    private IMyFocusService myFocusService;

    //查看所有用户信息
    @GetMapping("findAll")
    public List<Userinfo> findAll(){
        return userinfoService.findAll();
    }

    //根据ID查看用户信息
    @GetMapping("findById")
    public Userinfo findById(Integer uid){
        return userinfoService.findById(uid);
    }

    //新增用户信息
    @PostMapping("save")
    public void save(Userinfo userinfo){
        userinfoService.save(userinfo);
    }

    //修改用户信心
    @PostMapping("update")
    public void update(Userinfo userinfo){
        userinfoService.update(userinfo);
    }

    //获取所有好友信息
    @GetMapping("getFriends")
    public List<Userinfo> getFriends(Integer myid){
        return myFriendService.getFriends(myid);
    }

    //根据ID获取单个好友信息
    @GetMapping("getOneFriend")
    public Userinfo getOneFriend(Integer toid){
        return myFriendService.getFriendById(toid);
    }

    //获取所有我关注的用户的信息
    @GetMapping("getMyFocus")
    public List<Userinfo> getMyFocus(Integer focusid){
        return myFocusService.getMyFocus(focusid);
    }

    //获取所有场馆订单


}
