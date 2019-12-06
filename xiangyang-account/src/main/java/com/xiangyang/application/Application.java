package com.xiangyang.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.yixiangyang.controller.MyBatisConfig;
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = { "com.yixiangyang.controller", "com.yixiangyang.service" })
@org.springframework.cloud.netflix.feign.EnableFeignClients(basePackages = {"com.csp.tp.client","com.csp.tp.feign" })
@MapperScan(basePackages= {"com.yixiangyang.mapper"})
@EnableEurekaClient
//@Import(MyBatisConfig.class)
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
