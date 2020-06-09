package com.yoga.service;

import com.yoga.entity.Myfriend;
import com.yoga.entity.Userinfo;

import java.util.List;

/**
 * @author bai
 * @create 2020-06-10-上午 12:04
 * @desc 我的好友模块业务层接口
 */
public interface IMyFriendService {

    List<Userinfo> getFriends(Integer myid);

    Userinfo getFriendById(Integer toid);


}
