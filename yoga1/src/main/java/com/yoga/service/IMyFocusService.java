package com.yoga.service;

import com.yoga.entity.Userinfo;

import java.util.List;

/**
 * @author bai
 * @create 2020-06-10-上午 12:26
 * @desc @desc 用户关注列表的业务层接口
 */
public interface IMyFocusService {
    //获取我关注的用户信息
    List<Userinfo> getMyFocus(Integer focusid);
    //获取我的粉丝信息
    List<Userinfo> getMyFocused(Integer focusedid);
}
