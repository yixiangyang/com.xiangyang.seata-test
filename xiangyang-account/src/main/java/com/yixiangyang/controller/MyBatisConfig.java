package com.yixiangyang.controller;

import com.alibaba.druid.pool.DruidDataSource;
import com.zaxxer.hikari.HikariDataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.seata.rm.datasource.DataSourceProxy;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.transaction.SpringManagedTransactionFactory;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
@Configuration
public class MyBatisConfig {
	 private DataSourceProperties dataSourceProperties;
	 
	 public MyBatisConfig(DataSourceProperties dataSourceProperties) {
		  this.dataSourceProperties = dataSourceProperties;
	 }

	 @Bean
//	    @ConfigurationProperties(prefix = "spring.datasource")
	    public DataSource druidDataSource(){
//	        DruidDataSource druidDataSource = new DruidDataSource();
		 	HikariDataSource dataSource = new HikariDataSource();
	        System.out.println(dataSourceProperties.getUrl());
	        System.out.println(dataSourceProperties.getUsername());
	        System.out.println(dataSourceProperties.getPassword());
	        System.out.println(dataSourceProperties.getDriverClassName());
	        dataSource.setJdbcUrl(dataSourceProperties.getUrl());
	        dataSource.setUsername(dataSourceProperties.getUsername());
	        dataSource.setPassword(dataSourceProperties.getPassword());
	        dataSource.setDriverClassName(dataSourceProperties.getDriverClassName());
	        return dataSource;
	    }

	    @Primary
	    @Bean("dataSource")
	    public DataSourceProxy dataSource(DataSource druidDataSource){
	        return new DataSourceProxy(druidDataSource);
	    }

	    @Bean
	    public SqlSessionFactory sqlSessionFactory(DataSourceProxy dataSourceProxy)throws Exception{
	        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
	        sqlSessionFactoryBean.setDataSource(dataSourceProxy);
	        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
	        .getResources("classpath*:/mapper/*.xml"));
	        sqlSessionFactoryBean.setTransactionFactory(new SpringManagedTransactionFactory());
	        return sqlSessionFactoryBean.getObject();
	    }

}
