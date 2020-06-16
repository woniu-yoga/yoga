package com.yoga.service;

import com.yoga.entity.Userinfo;

import java.util.List;

/**
 * @author bai
 * @create 2020-06-09-上午 9:36
 */
public interface IUserinfoService {
    //查询所有用户
    List<Userinfo> findAll();

    //根据id查询
    Userinfo findById(Integer uid);

    //新增用户
    void save(Userinfo userinfo);

    //修改用户
    void update(Userinfo userinfo);

    /**
     * @author ayw
     * 根据名称查找用户顺便带出权限以及角色
     */
    Userinfo loginin(String uname);


    void insert(Userinfo info);
}
