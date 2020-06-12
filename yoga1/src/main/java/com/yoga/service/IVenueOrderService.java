package com.yoga.service;

import com.yoga.entity.VenueOrder;

import java.util.List;

/**
 * @author bai
 * @create 2020-06-10-下午 8:23
 * @desc 场馆订单业务层接口
 */
public interface IVenueOrderService {

    //查询所有瑜伽场馆的订单
    List<VenueOrder> findAll();

    //根据瑜伽场馆订单号查询一条数据
    VenueOrder findById(String venueOrderId);

    //插入新订单
    void save (VenueOrder venueOrder);

    //修改订单
    void update (VenueOrder venueOrder);

    //根据付款用户查找对应的瑜伽场馆订单
    List<VenueOrder> findByPayUid(Integer payuid);

    //根据瑜伽场馆ID查询当前瑜伽馆的所有订单
    List<VenueOrder> findByReceiveUid(Integer receiveuid);




}
