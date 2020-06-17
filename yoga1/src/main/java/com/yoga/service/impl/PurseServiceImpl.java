package com.yoga.service.impl;

import com.yoga.entity.Purse;
import com.yoga.entity.PurseExample;
import com.yoga.mapper.PurseMapper;
import com.yoga.service.IPurseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author bai
 * @create 2020-06-12-下午 3:08
 * @descr 我的钱包模块业务层实现类
 */
@Service
@Transactional
public class PurseServiceImpl implements IPurseService {
    @Resource
    private PurseMapper purseMapper;
    @Override
    public Purse findByUid(Integer uid) {
        PurseExample example = new PurseExample();
        PurseExample.Criteria criteria = example.createCriteria();
        criteria.andUidEqualTo(uid);
        List<Purse> purses = purseMapper.selectByExample(example);
        return purses.size()==0?null:purses.get(0);
    }
}
