package com.yoga.service.impl;

import com.yoga.mapper.PurseInOutMapper;
import com.yoga.service.IPurseInOutService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author bai
 * @create 2020-06-13-上午 9:48
 */
@Service
@Transactional
public class PurseInOutServiceImpl implements IPurseInOutService {
    @Resource
    private PurseInOutMapper purseInOutMapper;


}
