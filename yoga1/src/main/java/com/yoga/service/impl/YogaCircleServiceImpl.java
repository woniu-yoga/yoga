package com.yoga.service.impl;

import com.yoga.entity.Userinfo;
import com.yoga.entity.YogaCircle;
import com.yoga.entity.YogaCircleExample;
import com.yoga.mapper.YogaCircleMapper;
import com.yoga.service.IYogaCircleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author bai
 * @create 2020-06-10-下午 11:55
 * @desc 瑜乐圈模块业务层接口
 */
@Service
@Transactional
public class YogaCircleServiceImpl implements IYogaCircleService {

    @Resource
    private YogaCircleMapper yogaCircleMapper;
    //查看我发布的瑜乐圈
    @Override
    public List<YogaCircle> findMyCircle(Integer uid) {
        YogaCircleExample example = new YogaCircleExample();
        YogaCircleExample.Criteria criteria = example.createCriteria();
        criteria.andCircleUidEqualTo(uid);
        return yogaCircleMapper.selectByExample(example);
    }

    @Override
    public List<YogaCircle> findYogaCircle(List<Integer> uids) {
        YogaCircleExample example = new YogaCircleExample();
        YogaCircleExample.Criteria criteria = example.createCriteria();
        criteria.andCircleUidIn(uids);
        example.setOrderByClause(" circle_time desc ");
        return yogaCircleMapper.selectByExample(example);
    }


}
