package com.yoga.service.impl;

import com.yoga.entity.CoachOrder;
import com.yoga.entity.CoachOrderExample;
import com.yoga.mapper.CoachOrderMapper;
import com.yoga.service.ICoachOrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author bai
 * @create 2020-06-10-下午 11:04
 * @desc 预约瑜伽教练模块业务层实现类
 */
@Service
@Transactional
public class CoachOrderServiceImpl implements ICoachOrderService {
    @Resource
    private CoachOrderMapper coachOrderMapper;

    //根据付款用户ID查询该用户所有预约私教的订单
    @Override
    public List<CoachOrder> findByPayUid(Integer payuid) {
        CoachOrderExample example = new CoachOrderExample();
        CoachOrderExample.Criteria criteria = example.createCriteria();
        criteria.andPayUidEqualTo(payuid);
        return coachOrderMapper.selectByExample(example);
    }
}
