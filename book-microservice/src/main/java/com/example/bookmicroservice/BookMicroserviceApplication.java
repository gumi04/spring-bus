package com.example.bookmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class BookMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMicroserviceApplication.class, args);
	}

}
