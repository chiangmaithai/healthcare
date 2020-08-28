package com.simms.service_registry_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceRegistryDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryDemoApplication.class, args);
	}

}
