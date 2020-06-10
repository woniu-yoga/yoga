package com.yoga.service.impl;

import com.yoga.entity.VenueOrder;
import com.yoga.entity.VenueOrderExample;
import com.yoga.mapper.VenueOrderMapper;
import com.yoga.service.IVenueOrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author bai
 * @create 2020-06-10-下午 10:20
 * @desc 场馆订单模块业务层实现类
 */
@Service
@Transactional
public class VenueOrderServiceImpl implements IVenueOrderService {

    @Resource
    private VenueOrderMapper venueOrderMapper;

    //查询所有瑜伽场馆的订单
    @Override
    public List<VenueOrder> findAll() {
        return venueOrderMapper.selectByExample(null);
    }
    //根据瑜伽场馆订单号查询一条数据
    @Override
    public VenueOrder findById(String venueOrderId) {
        return venueOrderMapper.selectByPrimaryKey(venueOrderId);
    }
    //插入新订单
    @Override
    public void save(VenueOrder venueOrder) {
        venueOrderMapper.insert(venueOrder);
    }
    //修改订单
    @Override
    public void update(VenueOrder venueOrder) {
        venueOrderMapper.updateByPrimaryKey(venueOrder);
    }
    //根据付款用户查找对应的瑜伽场馆订单
    @Override
    public List<VenueOrder> findByPayUid(Integer payuid) {
        VenueOrderExample example = new VenueOrderExample();
        VenueOrderExample.Criteria criteria = example.createCriteria();
        criteria.andPayUidEqualTo(payuid);
        return venueOrderMapper.selectByExample(example);
    }
    //根据瑜伽场馆ID查询当前瑜伽馆的所有订单
    @Override
    public List<VenueOrder> findByReceiveUid(Integer receiveuid) {
        VenueOrderExample example = new VenueOrderExample();
        VenueOrderExample.Criteria criteria = example.createCriteria();
        criteria.andReceiveUidEqualTo(receiveuid);
        return venueOrderMapper.selectByExample(example);
    }


}
