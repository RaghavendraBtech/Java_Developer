package com.raghu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
// MS has become eligible to register
@EnableDiscoveryClient
public class MicroserviceProj02MsDevelopmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceProj02MsDevelopmentApplication.class, args);
	}

}
