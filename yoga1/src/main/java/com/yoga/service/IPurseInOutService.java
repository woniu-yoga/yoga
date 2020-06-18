package com.yoga.service;

/**
 * @author bai
 * @create 2020-06-12-下午 5:54
 * @desc 钱包的转入转出记录业务层接口
 */
public interface IPurseInOutService {
    //根据我的钱包id查找转账记录
    List<PurseInOut> findByPurseId(Integer purseid);
}
