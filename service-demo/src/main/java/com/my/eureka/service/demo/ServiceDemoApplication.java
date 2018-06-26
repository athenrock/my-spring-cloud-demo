package com.my.eureka.service.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDemoApplication.class, args);
	}
}
