package com.yixiangyang.controller;

import com.alibaba.druid.pool.DruidDataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.seata.rm.datasource.DataSourceProxy;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Primary;
@Configuration
public class MyBatisConfig {
	 @Bean
	    @ConfigurationProperties(prefix = "spring.datasource")
	    public DruidDataSource druidDataSource() {
	        return new DruidDataSource();
	    }

	    @Primary
	    @Bean
	    public DataSourceProxy dataSourceProxy(DruidDataSource druidDataSource) {
	        return new DataSourceProxy(druidDataSource);
	    }
}
