package com.yoga.service;

import com.yoga.entity.Userinfo;
import com.yoga.entity.YogaCircle;

import java.util.List;

/**
 * @author bai
 * @create 2020-06-10-下午 11:52
 * @desc 瑜乐圈模块业务层接口
 */
public interface IYogaCircleService {

    //查看我发布的瑜乐圈
    List<YogaCircle> findMyCircle(Integer circleuid);

    //查看我的瑜乐圈(好友发布的瑜乐圈)
    List<YogaCircle> findYogaCircle(List<Integer> uids);

}
