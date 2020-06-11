package com.yoga.service;

import com.yoga.entity.FriendReq;

import java.util.List;

/**
 * @author bai
 * @create 2020-06-10-下午 11:17
 * @desc 好友申请模块业务层接口
 */
public interface IFriendReqService {
    //查询当前用户收到的好友申请
    List<FriendReq> findByReceiveUid(Integer receiveuid);
    //查询我发出的好友申请
    List<FriendReq> findByReqUid(Integer requid);
}
