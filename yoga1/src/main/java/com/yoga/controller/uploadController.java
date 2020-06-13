package com.yoga.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
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
public class uploadController {
    SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd/");
    @GetMapping("/import")
    public Map<String,Object> upload(HttpServletRequest req, MultipartFile file) throws IOException {
        Map<String,Object> map = new HashMap<>();
        String format = sdf.format(new Date());
        //获取项目
        String realPath = req.getServletContext().getRealPath("/upload") + format;
        //Spring Boot 获取项目根路径或者资源文件的路径
        Resource resource = new ClassPathResource("");

        System.out.println("项目根路径----"+resource.getFile().getAbsolutePath());
        String proPath = resource.getFile().getAbsolutePath();
        proPath = proPath.replace("\\target\\classes","\\src\\main\\resources\\static\\imgs") + format ;
        System.out.println("修改后的路径------" + proPath);
        System.out.println("文件上传的路径----" + realPath );
        System.out.println("getScheme----" + req.getScheme());
        System.out.println("req.getServerName()----" + req.getServerName());
        System.out.println("req.getServerPort()----" + req.getServerPort());
        System.out.println();
        System.out.println();
        File folder = new File(proPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        String oldName = file.getOriginalFilename();
        String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."));

            file.transferTo(new File(folder,newName));

            String url = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + "/import" + format + newName;
            System.out.println("url-----"+url);
            map.put("message",true);


        return map;
    }
}
