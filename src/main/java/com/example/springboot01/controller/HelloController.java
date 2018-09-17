package com.example.springboot01.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @classname: 
 * @description: 
 * @author luopf 2018/9/17
 */
@RestController
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/hello")
    private String index(){
        return "Hello World!";
    }
}
