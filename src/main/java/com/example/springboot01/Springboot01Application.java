package com.example.springboot01;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Springboot01Application {

    public static void main(String[] args) {
        // 启动方式一：
        //SpringApplication.run(Springboot01Application.class, args);

        // 启动方式二：
//        SpringApplication springApplication = new SpringApplication(Springboot01Application.class);
//        springApplication.setBannerMode(Banner.Mode.OFF);
//        springApplication.run(args);

        // 启动方式三：
        new SpringApplicationBuilder(Springboot01Application.class)
                .bannerMode(Banner.Mode.OFF)
                .build()
                .run(args);

        //效果和MyStartupRunnerTest2一样
        /**
         System.out.println("=================================");
         System.out.println("=============启动成功===============");
         System.out.println("=================================");
         */

    }
}
