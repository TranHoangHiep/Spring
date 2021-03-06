/***************************************************************************
 * Copyright 2016-2017 by HomeDirect -
 * All rights reserved. *
 **************************************************************************/
package edu.spring.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Author : Tran Hoang Hiep Email:
 * hiep.tranhoang@homedirect.com.vn Feb
 * 3, 2017
 */
@Configuration
@EnableWebMvc
public class AppConfig extends WebMvcConfigurerAdapter {

  @Override
  public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
    // super.configureDefaultServletHandling(configurer);
    configurer.enable();
  }

  @Bean
  public InternalResourceViewResolver viewResolver() {
    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
    resolver.setPrefix("WEB-INF/jsp/");
    resolver.setSuffix(".jsp");
    return resolver;
  }

}
