package com.yoga.service;

import com.yoga.entity.CoachOrder;

import java.util.List;

/**
 * @author bai
 * @create 2020-06-10-下午 10:52
 * @desc 预约瑜伽教练模块业务层接口
 */
public interface ICoachOrderService {
    //根据付款用户ID查询该用户所有预约私教的订单
    List<CoachOrder> findByPayUid(Integer payuid);
}
