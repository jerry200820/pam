package com.xinrong.pam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: Jerry_shi34268
 * @Date: 2022/7/4 15:27
 * @Description:
 *
 * 编写消费者启动类PamApplication.java，
 * 添加注解@MapperScan(basePackages = {“com.xinrong.pam.*.mapper”})
 * 含义：mybatis中Mapper文件对应的包，启动项目时会自动扫描
 */



@MapperScan(basePackages = {"com.xinrong.pam.*.mapper"})
@EnableEurekaClient
@SpringBootApplication
public class PamApplication {
     public static void  main(String[] args){
         SpringApplication.run(PamApplication.class);
     }
}
