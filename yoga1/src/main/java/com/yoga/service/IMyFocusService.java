package com.yoga.service;

import com.yoga.entity.Userinfo;

import java.util.List;

/**
 * @author bai
 * @create 2020-06-10-上午 12:26
 * @desc @desc 用户关注列表的业务层接口
 */
public interface IMyFocusService {
    List<Userinfo> getMyFocus(Integer focusid);
}
