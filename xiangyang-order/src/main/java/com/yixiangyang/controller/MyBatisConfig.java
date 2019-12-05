package com.yixiangyang.controller;

import com.alibaba.druid.pool.DruidDataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import io.seata.rm.datasource.DataSourceProxy;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
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
