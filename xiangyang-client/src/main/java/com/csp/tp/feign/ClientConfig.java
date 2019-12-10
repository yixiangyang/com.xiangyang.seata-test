package com.csp.tp.feign;

import org.springframework.context.annotation.Bean;

import feign.Logger;

public class ClientConfig {
  @Bean
  public Logger.Level logger() {
	  System.out.println("ggggggggggggggggggggggggggg");
   return Logger.Level.FULL;
  }
}
