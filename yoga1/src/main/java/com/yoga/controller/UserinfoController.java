package com.yoga.controller;

import com.yoga.entity.*;
import com.yoga.service.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 码云push测试
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
    @Resource
    private IVenueOrderService venueOrderService;
    @Resource
    private IFriendReqService friendReqService;
    @Resource
    private ICoachOrderService coachOrderService;
    @Resource
    private IYogaCircleService yogaCircleService;
    @Resource
    private IPurseService purseService;
    @Resource
    private IPurseInOutService purseInOutService;

    //获取所有我的好友信息
    @GetMapping("getFriends")
    public List<Userinfo> getFriends(Integer myid){
        return myFriendService.getFriends(myid);
    }

    //根据好友ID获取单个好友信息
    @GetMapping("getOneFriend")
    public Userinfo getOneFriend(Integer toid){
        return myFriendService.getFriendById(toid);
    }

    //查询当前用户收到的好友申请
    @GetMapping("getFriendReqReceive")
    public List<FriendReq> getFriendReqReceive(Integer receiveuid){
        return friendReqService.findByReceiveUid(receiveuid);
    }

    //查询我发出的好友申请
    @GetMapping("getFriendReq")
    public List<FriendReq> getFriendReq(Integer requid){
        return friendReqService.findByReqUid(requid);
    }

    //获取所有我关注的用户的信息
    @GetMapping("getMyFocus")
    public List<Userinfo> getMyFocus(Integer focusuid){
        return myFocusService.getMyFocus(focusuid);
    }

    //查询我的粉丝信息
    @GetMapping("getMyFocused")
    public List<Userinfo> getMyFocused(Integer focusedid){
        return myFocusService.getMyFocused(focusedid);
    }

    //获取所有当前用户预定瑜伽场馆的订单
    @GetMapping("getMyVenueOrder")
    public List<VenueOrder> getMyVenueOrder(Integer uid){
        return venueOrderService.findByPayUid(uid);
    }

    //获取所有预定瑜伽教练的订单
    @GetMapping("getMyCoachOrder")
    public List<CoachOrder> getMyCoachOrder(Integer uid){
        return coachOrderService.findByPayUid(uid);
    }

    //查看好友的瑜乐圈状态(按时间排序)
    @GetMapping("getYogaCircle")
    public List<YogaCircle> getYogaCircle(Integer myid){
        List<Userinfo> friends = myFriendService.getFriends(myid);
        List<Integer> uids = new ArrayList<>();
        for (Userinfo friend : friends) {
            uids.add(friend.getUid());
        }
        List<YogaCircle> yogaCircles = yogaCircleService.findYogaCircle(uids);
        return yogaCircles;
    }

    //查看我的瑜乐圈记录
    @GetMapping("getMyCircle")
    public List<YogaCircle> getMyCircle(Integer circleuid){
        List<YogaCircle> myCircle = yogaCircleService.findMyCircle(circleuid);
        return myCircle;
    }

    //我的钱包
    @GetMapping("mypurse")
    public Purse mypurse(Integer uid){
        return purseService.findByUid(uid);
    }

    //查询转账记录
    @GetMapping("purseInOuts")
    public List<PurseInOut> purseInOuts(Integer uid){
        Purse mypurse = purseService.findByUid(uid);
        List<PurseInOut> inOuts = purseInOutService.findByPurseId(mypurse.getPurseid());
        return inOuts;
    }

    //查询附近的人
    @GetMapping("nearBy")
    public List<Userinfo> nearBy(Double lng , Double lat){
        return userinfoService.nearBy(lng ,lat);
    }

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

    //修改用户信息
    @PostMapping("update")
    public void update(Userinfo userinfo){
        userinfoService.update(userinfo);
    }


}
