package com.example.RESILIENCE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.SpringCloudApplication;



@SpringBootApplication
public class ResilienceApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
	    return builder.sources(ResilienceApplication.class);
	  }

	public static void main(String[] args) {
		SpringApplication.run(ResilienceApplication.class, args);
	}

}
