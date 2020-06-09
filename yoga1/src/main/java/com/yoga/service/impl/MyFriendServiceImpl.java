package com.yoga.service.impl;

import com.yoga.entity.Myfriend;
import com.yoga.entity.MyfriendExample;
import com.yoga.entity.Userinfo;
import com.yoga.mapper.MyfriendMapper;
import com.yoga.mapper.UserinfoMapper;
import com.yoga.service.IMyFriendService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author bai
 * @create 2020-06-10-上午 12:09
 * @desc 我的好友模块业务层实现类
 */
@Service
@Transactional
public class MyFriendServiceImpl implements IMyFriendService {
    @Resource
    private MyfriendMapper myfriendMapper;
    @Resource
    private UserinfoMapper userinfoMapper;

    @Override
    public List<Userinfo> getFriends(Integer myid) {
        List<Userinfo> myFriendlist = new ArrayList<>();
        MyfriendExample example = new MyfriendExample();
        MyfriendExample.Criteria criteria = example.createCriteria();
        criteria.andMyidEqualTo(myid);
        List<Myfriend> myfriends = myfriendMapper.selectByExample(example);
        for (Myfriend myfriend : myfriends) {
            Userinfo userinfo = userinfoMapper.selectByPrimaryKey(myfriend.getToid());
            myFriendlist.add(userinfo);
        }
        return myFriendlist;
    }

    @Override
    public Userinfo getFriendById(Integer toid) {
        Userinfo userinfo = userinfoMapper.selectByPrimaryKey(toid);
        return userinfo;
    }
}
