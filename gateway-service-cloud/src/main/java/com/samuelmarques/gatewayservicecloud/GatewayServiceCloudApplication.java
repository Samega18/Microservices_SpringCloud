package com.samuelmarques.gatewayservicecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GatewayServiceCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceCloudApplication.class, args);
	}

}