package com.unidadcoronaria.crm.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAutoConfiguration
@EnableScheduling
public class CrmApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CrmApplication.class, args);
	}
	
}