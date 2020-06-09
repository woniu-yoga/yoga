package com.yoga;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yoga.mapper")
public class Yoga1Application {

    public static void main(String[] args) {
        SpringApplication.run(Yoga1Application.class, args);
    }

}
