package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer

@SpringBootApplication
public class SpringbootAdminClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAdminClientApplication.class, args);
	}
	
}
