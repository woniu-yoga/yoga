package com.yoga.service;

import com.yoga.entity.Coach;
import com.yoga.entity.JobsInfo;
import com.yoga.entity.Venue;

import java.util.List;

public interface IVenueService {
    //管理员对场馆的所有操作
    List<Venue> findAll();
    Venue findById(Integer id);
    void save(Venue venue);
    void deleteById(Integer id);
    void update(Venue venue);


    //场馆拥有的所有操作
    //查询场馆下拥有的所有教练
    List<Coach> findCoachByVenue(Integer id);
    //场馆添加招聘信息
    void  add(JobsInfo info);
    //删除招聘信息
    void deleteJobById(Integer id);
    //修改招聘信息
    void updateJobinfo(JobsInfo info);
    //查询场馆发布的所有的招聘信息
    List<JobsInfo> findJobByVenue(Integer id);
    //解雇教练
    void deleteCoach(Integer id);

}
