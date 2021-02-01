package com.example.demo13.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2021/2/1
 * @Description: com.example.demo13.controller
 * @Version: 1.0
 */

@RestController
public class A {
    @GetMapping("/hello")
    public String RR(){
        return "hahahha";
    }
}
