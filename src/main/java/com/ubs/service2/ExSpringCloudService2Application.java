package com.ubs.service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ExSpringCloudService2Application {

	public static void main(String[] args) {
		SpringApplication.run(ExSpringCloudService2Application.class, args);
	}

}
