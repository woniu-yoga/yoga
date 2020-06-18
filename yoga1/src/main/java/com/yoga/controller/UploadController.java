package com.yoga.controller;

import com.yoga.entity.Venue;
import com.yoga.mapper.VenueMapper;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @ClassName uploadController
 * @Description TODO
 * @Author GC
 * @Date 2020-06-14 23:17
 * @Version 1.0
 */
@RestController
public class UploadController {
    @javax.annotation.Resource
            private VenueMapper venueMapper;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
    @PostMapping("/upload")
    public Map<String,Object> upload(HttpServletRequest req, MultipartFile file) throws IOException {
        Map<String,Object> map = new HashMap<>();


            //获得上传的文件的名字
            String fileName = file.getOriginalFilename();
            System.out.println("上传的文件的名字----" + fileName);
            //获得上传文件的后缀
        String suffix = fileName.substring(fileName.lastIndexOf("."));


        //获取项目的路径,这个路径是boot的路径,在c盘,重启服务器就会改变
//        String realPath = req.getServletContext().getRealPath("/upload");
        //System.out.println("文件上传的路径----" + realPath );

        //Spring Boot 获取项目根路径或者资源文件的路径
        Resource resource = new ClassPathResource("");
        System.out.println("项目根路径----"+resource.getFile().getAbsolutePath());
        String proPath = resource.getFile().getAbsolutePath();
        String filePath = proPath.replace("\\target\\classes","\\src\\main\\resources\\static\\imgs");
        System.out.println("存储的路径的路径------" + filePath);

        System.out.println("getScheme----" + req.getScheme());
        System.out.println("req.getServerName()----" + req.getServerName());
        System.out.println("req.getServerPort()----" + req.getServerPort());

        File folder = new File(filePath);
        //folder.exists()判断File对象是否存在
        if (!folder.exists()) {
            //不存在则创建
            folder.mkdirs();
        }

        String format = sdf.format(new Date());

        String newName = format + suffix;

        String url = filePath +"\\" + newName;
        System.out.println("url-------"   + url);
        Venue v=new Venue();
        v.setLicence(url);
        venueMapper.insert(v);
        try {
            //将上传的临时文件写入指定位置
            file.transferTo(new File(folder,newName));
            map.put("message",true);
        }catch (Exception  e){
            map.put("message",false);
            e.printStackTrace();
        }

        return map;
    }
    @PostMapping("/uploads")
    public Map<String,Object> uploads(HttpServletRequest req, @RequestParam("file")MultipartFile[] files) throws IOException {
        System.out.println("files--------" + files.length);
        Map<String,Object> map = new HashMap<>();
        //Spring Boot 获取项目根路径或者资源文件的路径
        Resource resource = new ClassPathResource("");
        System.out.println("项目根路径----"+resource.getFile().getAbsolutePath());
        String proPath = resource.getFile().getAbsolutePath();
        String filePath = proPath.replace("\\target\\classes","\\src\\main\\resources\\static\\imgs");
        System.out.println("filePath---------" + filePath);

        File folder = new File(filePath);
        //folder.exists()判断File对象是否存在
        if (!folder.exists()) {

            //不存在则创建
            folder.mkdirs();
        }
        System.out.println("---------------------------------");
        if (files != null && files.length>0){
            System.out.println("if------:"+files.length);
            for (int i=0;i<files.length;i++){
                System.out.println("for----------"+files.length);
                String fileName = files[i].getOriginalFilename();
                //获得上传文件的后缀
                String suffix = fileName.substring(fileName.lastIndexOf("."));
                String format = sdf.format(new Date());

                String newName = format+ (int)(Math.random()*10) + suffix;
                try {
                    files[i].transferTo(new File(folder,newName));
                    map.put("message",true);
                } catch (IOException e) {
                    map.put("message",false);
                    e.printStackTrace();
                } catch (IllegalStateException e) {
                    map.put("message",false);
                    e.printStackTrace();
                }

                String urls = filePath +"\\" + newName;
                System.out.println("urls-------"   + urls);
            }
        }


        return map;
    }
}
