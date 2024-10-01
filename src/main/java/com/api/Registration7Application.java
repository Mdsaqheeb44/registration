package com.api;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Registration7Application {

	public static void main(String[] args) {
		SpringApplication.run(Registration7Application.class, args);
	}

	@Bean
	public ModelMapper getRegistration(){

		return new ModelMapper();
	}
}
