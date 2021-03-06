package com.yoga.service.impl;

import com.yoga.entity.MyFocus;
import com.yoga.entity.MyFocusExample;
import com.yoga.entity.Userinfo;
import com.yoga.entity.UserinfoExample;
import com.yoga.mapper.MyFocusMapper;
import com.yoga.mapper.UserinfoMapper;
import com.yoga.service.IMyFocusService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author bai
 * @create 2020-06-10-上午 12:32
 * @desc 用户关注列表的业务层实现类
 */
@Service
@Transactional
public class MyFocusServiceImpl implements IMyFocusService {

    @Resource
    private MyFocusMapper myFocusMapper;
    @Resource
    private UserinfoMapper userinfoMapper;
    //获取我关注的用户信息
    @Override
    public List<Userinfo> getMyFocus(Integer focusid) {
        List<Userinfo> userinfoList = new ArrayList<>();
        MyFocusExample example = new MyFocusExample();
        MyFocusExample.Criteria criteria = example.createCriteria();
        criteria.andFocusUidEqualTo(focusid);
        List<MyFocus> myFocusList = myFocusMapper.selectByExample(example);
        for (MyFocus myFocus : myFocusList) {
            Userinfo userinfo = userinfoMapper.selectByPrimaryKey(myFocus.getFocusedUid());
            userinfoList.add(userinfo);
        }
        return userinfoList;
    }
    //获取我的粉丝信息
    @Override
    public List<Userinfo> getMyFocused(Integer focusedid) {
        List<Userinfo> userinfoList = new ArrayList<>();
        MyFocusExample example = new MyFocusExample();
        MyFocusExample.Criteria criteria = example.createCriteria();
        criteria.andFocusedUidEqualTo(focusedid);
        List<MyFocus> myFocusList = myFocusMapper.selectByExample(example);
        for (MyFocus myFocus : myFocusList) {
            Userinfo userinfo = userinfoMapper.selectByPrimaryKey(myFocus.getFocusUid());
            userinfoList.add(userinfo);
        }
        return userinfoList;
    }

    @Override
    public void delete(Integer focusuid, Integer focuseduid) {
        MyFocusExample example = new MyFocusExample();
        MyFocusExample.Criteria criteria = example.createCriteria();
        criteria.andFocusUidEqualTo(focusuid);
        criteria.andFocusedUidEqualTo(focuseduid);
        myFocusMapper.deleteByExample(example);
    }

}
