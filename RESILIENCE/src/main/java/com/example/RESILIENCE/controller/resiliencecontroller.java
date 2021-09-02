package com.example.RESILIENCE.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/microservice2")
public class resiliencecontroller {
		 
	 @Value("${server.port}")
	 private String port;
	 
	 @GetMapping("/port")
	 public String getPort()
	 {
	       return "Microservice2 is running on port: "+ port;
	 }
	}


