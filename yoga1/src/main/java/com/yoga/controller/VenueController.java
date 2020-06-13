package com.yoga.controller;

import com.yoga.entity.Coach;
import com.yoga.entity.Venue;
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
    public Map<String,Object> findOne(Integer id){
        Map<String,Object> map = new HashMap<>();

        try {
            Venue venue = venueServiceImpl.findById(id);
            map.put("message",true);
            map.put("infos",venue);
        } catch (Exception e) {
            map.put("message",false);
            e.printStackTrace();
        }
        return map;
    }
    //根据id删除场馆
    @GetMapping("/deleteById")
    public Map<String,Object> deleteById(Integer id){
        Map<String,Object> map = new HashMap<>();

        try {
            venueServiceImpl.deleteById(id);
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
    public Map<String,Object> findCoachByVenue(Integer id){
        Map<String,Object> map = new HashMap<>();

        try {
            List<Coach> coaches = venueServiceImpl.findCoachByVenue(id);
            map.put("message",true);
            map.put("coaches",coaches);
        } catch (Exception e) {
            map.put("message",false);
            e.printStackTrace();
        }
        return map;
    }

}