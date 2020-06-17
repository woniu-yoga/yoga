package com.yoga.service;

import com.yoga.entity.PurseInOut;

import java.util.List;

/**
 * @author bai
 * @create 2020-06-12-下午 5:54
 * @desc 钱包的转入转出记录业务层接口
 */
public interface IPurseInOutService {

    List<PurseInOut> findByPurseId(Integer purseid);
}
