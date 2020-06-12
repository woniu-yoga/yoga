package com.yoga;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@MapperScan("com.yoga.mapper")

@SpringBootApplication
public class Yoga1Application {

    public static void main(String[] args) {
        SpringApplication.run(Yoga1Application.class, args);
    }

}
