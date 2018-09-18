package com.example.springboot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot01Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot01Application.class, args);
        //效果和MyStartupRunnerTest2一样
        /**
         System.out.println("=================================");
         System.out.println("=============启动成功===============");
         System.out.println("=================================");
         */

    }
}
