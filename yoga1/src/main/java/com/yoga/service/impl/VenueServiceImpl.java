package com.yoga.service.impl;

import com.yoga.entity.*;
import com.yoga.mapper.CoachMapper;
import com.yoga.mapper.JobsInfoMapper;
import com.yoga.mapper.VenueCourseMapper;
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
    @Resource
    private VenueCourseMapper venueCourseMapper;
    //查询所有的场馆
    @Override
    public List<Venue> findAll() {
        return venueMapper.selectByExample(null);
    }
    //查询一个场馆
    @Override
    public Venue findById(Integer id) {
        return venueMapper.findById(id);
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
        return jobsInfoMapper.findJobByVenue(id);
    }


    //解雇教练
    @Override
    public void deleteCoach(Integer id) {
        coachMapper.updateCoachById(id);
    }

    //添加场馆的课程
    @Override
    public void addCourseByVenue(VenueCourse venueCourse) {
         venueCourseMapper.insert(venueCourse);
    }
    //删除单个场馆课程

    @Override
    public void deleteVenueById(Integer id) {
        venueCourseMapper.deleteByPrimaryKey(id);
    }
    //修改场馆课程
    @Override
    public void updateVenue(VenueCourse venueCourse) {
        venueCourseMapper.updateByPrimaryKey(venueCourse);
    }
    // 查询场馆自己的所有课程
    @Override
    public List<VenueCourse> findAllVenueCourse(Integer id) {
        VenueCourseExample example = new VenueCourseExample();
        VenueCourseExample.Criteria criteria =  example.createCriteria();
        criteria.andVenueUidEqualTo(id);
        return venueCourseMapper.selectByExample(example);
    }
}
