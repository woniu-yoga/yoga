package com.yoga.service.impl;

import com.yoga.entity.Userinfo;
import com.yoga.mapper.UserinfoMapper;
import com.yoga.service.IUserinfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author bai
 * @create 2020-06-09-上午 9:40
 */
@Service
@Transactional
public class UserinfoServiceImpl implements IUserinfoService {
    @Resource
    private UserinfoMapper userinfoMapper;
    @Override
    public List<Userinfo> findAll() {
        return userinfoMapper.selectByExample(null);
    }

    @Override
    public Userinfo findById(Integer uid) {
        return userinfoMapper.selectByPrimaryKey(uid);
    }

    @Override
    public void save(Userinfo userinfo) {
        userinfoMapper.insert(userinfo);
    }

    @Override
    public void update(Userinfo userinfo) {
        userinfoMapper.updateByPrimaryKeySelective(userinfo);
    }

    @Override
    public Userinfo loginin(String uname  ) {
        return userinfoMapper.loginin(uname);
    }

    @Override
    public List<Userinfo> nearBy(Double lng , Double lat) {
        return userinfoMapper.nearBy(lng,lat);
    }


}
