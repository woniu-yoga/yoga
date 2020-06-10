package com.yoga.service.impl;

import com.yoga.entity.FriendReq;
import com.yoga.entity.FriendReqExample;
import com.yoga.entity.Userinfo;
import com.yoga.mapper.FriendReqMapper;
import com.yoga.service.IFriendReqService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author bai
 * @create 2020-06-10-下午 11:18
 * @desc 好友申请模块业务层接口
 */
@Service
@Transactional
public class FriendReqServiceImpl implements IFriendReqService {
    @Resource
    private FriendReqMapper friendReqMapper;

    //查询当前用户收到的好友申请
    @Override
    public List<FriendReq> findByReceiveUid(Integer receiveuid) {
        FriendReqExample example = new FriendReqExample();
        FriendReqExample.Criteria criteria = example.createCriteria();
        criteria.andReceiveUidEqualTo(receiveuid);
        return friendReqMapper.selectByExample(example);
    }
    //查询我发出的好友申请
    @Override
    public List<FriendReq> findByReqUid(Integer requid) {
        FriendReqExample example = new FriendReqExample();
        FriendReqExample.Criteria criteria = example.createCriteria();
        criteria.andReqUidEqualTo(requid);
        return friendReqMapper.selectByExample(example);
    }
}
