package com.my.eureka.docker.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ReportAsSingleViolation;

@SpringBootApplication
@RestController
public class DockerServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerServerApplication.class, args);
	}

	@RequestMapping(value = "/hi")
	public String hello() {
		return "hi,I'm docker";
	}
}
