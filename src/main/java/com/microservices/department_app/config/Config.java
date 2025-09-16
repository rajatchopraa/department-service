package com.microservices.department_app.config;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
 @Bean
 ModelMapper modelMapper() {
	 return new ModelMapper();
 }
}
