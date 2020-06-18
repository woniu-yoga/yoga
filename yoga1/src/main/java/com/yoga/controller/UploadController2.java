package com.yoga.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
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
//@CrossOrigin
@RestController
public class UploadController2 {
    //上传文件
    @PostMapping("/import")
    public void save(@RequestParam(value="file",required=false) MultipartFile multipartFile,HttpServletRequest request){
        //获得上传文件的名字
        //getOriginalFilename()可以获得文件的名字
        String fileName = multipartFile.getOriginalFilename();
        System.out.println("****" + fileName);
        //获得上传文件的后缀
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        //通过request获得"/"项目发布位置的绝对路径
        //声明文件保存的位置
//        String realPath = request.getServletContext().getRealPath("/upload");
//        System.out.println(realPath);
        String filePath = System.getProperty("user.dir") + "\\yoga1\\src\\main\\resources\\static\\imgs\\";
//        String realPath = "C:\\Users\\26053\\Desktop\\gdj\\images";
        //获得项目发布后保存上传文件目录的File对象
        File file = new File(filePath);
        //file.exists()判断File对象是否存在
        if (file.exists()) {
            //不存在则创建
            file.mkdirs();
        }
        //声明一个新的文件名（不重复）
        //文件名不重复 00847636-5c86-4202-a8b9-8b340a0875c4.png
        //可以使用当前时间的毫秒数，将本方法变成线程安全的。
        String newFileName = UUID.randomUUID()+suffix;
        //声明一个新的文件(上传文件的目标对象)
        File target = new File(file,newFileName);
        try {
            //将上传的临时文件写入指定位置
            multipartFile.transferTo(target);
        } catch (Exception  e) {
            // TODO Auto-generated catch block

        }

    }

}
