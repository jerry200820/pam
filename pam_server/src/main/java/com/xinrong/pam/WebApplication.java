package com.xinrong.pam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: Jerry_shi34268
 * @Date: 2022/7/4 14:45
 * @Description:
 *
 * 添加注解@EnableEurekaServer和@SpringBootApplication，
 * 我这里想做一个纯注册中心，不与数据库挂钩，
 * 所以增加了一个exclude = DataSourceAutoConfiguration.class，
 * 启动项目时不自动与数据库连接，若想让注册中心也连接数据库，这个exclude也可以不要

 *
 */
@EnableEurekaServer
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class WebApplication {
 public  static  void main(String[] args){
     SpringApplication.run(WebApplication.class,args);
 }

}
