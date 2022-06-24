package com.Mini_Project_Eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MiniProjectEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniProjectEurekaApplication.class, args);
	}

}
