package com.raghu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceProj02BillingServiceMsProviderMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceProj02BillingServiceMsProviderMsApplication.class, args);
	}

}