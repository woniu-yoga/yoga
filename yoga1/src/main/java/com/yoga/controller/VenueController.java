package com.yoga.controller;

import com.yoga.entity.Coach;
import com.yoga.entity.JobsInfo;
import com.yoga.entity.Venue;
import com.yoga.entity.VenueCourse;
import com.yoga.service.IVenueService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName VenueController
 * @Description 场馆
 * @Author GC
 * @Date 2020-06-09 14:48
 * @Version 1.0
 */
@RestController
@RequestMapping("/venue")
public class VenueController {
    @Resource
    private IVenueService venueServiceImpl;
    //查询所有场馆
    @GetMapping("/findAll")
    public Map<String,Object> findAll(){
        Map<String,Object> map = new HashMap<>();

        try {
            List<Venue> venues = venueServiceImpl.findAll();
            System.out.println("venues------------" + venues);
            System.out.println(121);
            map.put("message",true);
            map.put("venues",venues);
        } catch (Exception e) {
            map.put("message",false);
            e.printStackTrace();
        }
        return map;
    }
    //根据id查询场馆
    @GetMapping("/findOne")
    public Map<String,Object> findOne(Integer uid){
        System.out.println("查询的场馆的id------" + uid);
        Map<String,Object> map = new HashMap<>();

        try {
            Venue venue = venueServiceImpl.findById(uid);
            map.put("message",true);
            map.put("venue",venue);
        } catch (Exception e) {
            map.put("message",false);
            e.printStackTrace();
        }
        return map;
    }
    //根据id删除场馆
    @GetMapping("/deleteById")
    public Map<String,Object> deleteById(Integer uid){
        Map<String,Object> map = new HashMap<>();

        try {
            venueServiceImpl.deleteById(uid);
            map.put("message",true);
        } catch (Exception e) {
            map.put("message",false);
            e.printStackTrace();
        }
        return map;
    }
    //添加场馆
    @PostMapping("/save")
    public Map<String,Object> sava(Venue venue){
        Map<String,Object> map = new HashMap<>();

        try {
            venueServiceImpl.save(venue);
            map.put("message",true);
        } catch (Exception e) {
            map.put("message",false);
            e.printStackTrace();
        }
        return map;
    }
    //修改场馆
    @PostMapping("/update")
    public Map<String,Object> update(Venue venue){
        Map<String,Object> map = new HashMap<>();

        try {
            venueServiceImpl.update(venue);
            map.put("message",true);
        } catch (Exception e) {
            map.put("message",false);
            e.printStackTrace();
        }
        return map;
    }

    //根据场馆查询场馆下的教练
    public Map<String,Object> findCoachByVenue(Integer uid){
        Map<String,Object> map = new HashMap<>();

        try {
            List<Coach> coaches = venueServiceImpl.findCoachByVenue(uid);
            map.put("message",true);
            map.put("coaches",coaches);
        } catch (Exception e) {
            map.put("message",false);
            e.printStackTrace();
        }
        return map;
    }
    //根据场馆查看场馆下的招聘信息
    @GetMapping("/findJobByVenue")
    public Map<String,Object> findJobByVenue(Integer uid){
        System.out.println("findJobByVenue------" + uid);
        Map<String,Object> map = new HashMap<>();

        try {
            List<JobsInfo> jobsInfos = venueServiceImpl.findJobByVenue(uid);
            map.put("message",true);
            map.put("jobsInfos",jobsInfos);
        } catch (Exception e) {
            map.put("message",false);
            e.printStackTrace();
        }
        return map;
    }

    //场馆添加自己的课程
    @PostMapping("/AddCourseByVenue")
    public Map<String,Object> AddCourseByVenue(Integer uid){

        Map<String,Object> map = new HashMap<>();

        try {
            List<JobsInfo> jobsInfos = venueServiceImpl.findJobByVenue(uid);
            map.put("message",true);
            map.put("jobsInfos",jobsInfos);
        } catch (Exception e) {
            map.put("message",false);
            e.printStackTrace();
        }
        return map;
    }
    //删除单个场馆课程
    @GetMapping("/deleteCourseById")
    public Map<String,Object> deleteCourseById(Integer uid){

        Map<String,Object> map = new HashMap<>();

        try {
            venueServiceImpl.deleteById(uid);
            map.put("message",true);

        } catch (Exception e) {
            map.put("message",false);
            e.printStackTrace();
        }
        return map;
    }
    //修改课程信息
    @PostMapping("/updateCourse")
    public Map<String,Object> updateCourse(VenueCourse venueCourse){

        Map<String,Object> map = new HashMap<>();

        try {
            venueServiceImpl.updateVenue(venueCourse);
            map.put("message",true);

        } catch (Exception e) {
            map.put("message",false);
            e.printStackTrace();
        }
        return map;
    }
    //查询场馆所有的课程
    @GetMapping("/findAllVenueCourse")
    public Map<String,Object> findAllVenueCourse(Integer venueuid){

        Map<String,Object> map = new HashMap<>();

        try {
            List<VenueCourse> venueCourses = venueServiceImpl.findAllVenueCourse(venueuid);
            map.put("message",true);
            map.put("venueCourses",venueCourses);
        } catch (Exception e) {
            map.put("message",false);
            e.printStackTrace();
        }
        return map;
    }
}
