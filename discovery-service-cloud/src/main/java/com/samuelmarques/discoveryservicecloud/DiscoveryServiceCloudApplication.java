package com.samuelmarques.discoveryservicecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryServiceCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServiceCloudApplication.class, args);
	}

}
