package com.yoga.service.impl;

import com.yoga.entity.Coach;
import com.yoga.entity.JobsInfo;
import com.yoga.entity.Venue;
import com.yoga.mapper.CoachMapper;
import com.yoga.mapper.JobsInfoMapper;
import com.yoga.mapper.VenueMapper;
import com.yoga.service.IVenueService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName VenueServiceImpl
 * @Description 场馆service
 * @Author GC
 * @Date 2020-06-09 14:59
 * @Version 1.0
 */
@Service
@Transactional
public class VenueServiceImpl implements IVenueService {
    @Resource
    private VenueMapper venueMapper;
    @Resource
    private JobsInfoMapper jobsInfoMapper;
    @Resource
    private CoachMapper coachMapper;
    @Override
    public List<Venue> findAll() {
        return venueMapper.selectByExample(null);
    }

    @Override
    public Venue findById(Integer id) {
        return venueMapper.selectByPrimaryKey(id);
    }

    @Override
    public void save(Venue venue) {
        venueMapper.insert(venue);
    }

    @Override
    public void deleteById(Integer id) {
        venueMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Venue venue) {
        venueMapper.updateByPrimaryKey(venue);
    }

    //根据场馆查找其拥有的教练
    @Override
    public List<Coach> findCoachByVenue(Integer id) {

        return venueMapper.findCoachByVenue(id);
    }

    @Override
    public void add(JobsInfo info) {
        jobsInfoMapper.insert(info);
    }

    //删除招聘信息
    @Override
    public void deleteJobById(Integer id) {
        jobsInfoMapper.updateId(id);
    }
    //修改招聘信息
    @Override
    public void updateJobinfo(JobsInfo info) {
        jobsInfoMapper.updateByPrimaryKey(info);
    }

    //查询场馆下的所有的招聘信息
    @Override
    public List<JobsInfo> findJobByVenue(Integer id) {
        return null;
    }


    //解雇教练
    @Override
    public void deleteCoach(Integer id) {
        coachMapper.updateCoachById(id);
    }
}
