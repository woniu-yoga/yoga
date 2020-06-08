package com.yoga.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bai
 * @create 2020-06-09-上午 1:20
 */
@RestController
public class TestController {

    @GetMapping("/say")
    public String say(){
        return "hello";
    }
}
