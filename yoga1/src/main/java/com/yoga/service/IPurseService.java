package com.yoga.service;

import com.yoga.entity.Purse;

/**
 * @author bai
 * @create 2020-06-12-下午 3:05
 * @desc 钱包模块
 */
public interface IPurseService {
    //根据用户Id查找对应的钱包信息
    Purse findByUid(Integer uid);
    //
}
