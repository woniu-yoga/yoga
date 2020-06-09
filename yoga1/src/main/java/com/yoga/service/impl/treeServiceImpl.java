package com.yoga.service.impl;

import com.yoga.entity.Tree;
import com.yoga.mapper.TreeMapper;
import com.yoga.service.treeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class treeServiceImpl implements treeService {
    @Resource
    private TreeMapper treeMapper;
    @Override
    public List<Tree> findAll() {
        return treeMapper.selectByExample(null);
    }
}
