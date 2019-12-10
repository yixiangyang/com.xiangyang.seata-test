package com.xiangyang.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = { "com.yixiangyang.controller", "com.yixiangyang.service" })
@MapperScan(basePackages= {"com.yixiangyang.mapper"})
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.csp.tp.client","com.csp.tp.feign" })
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
