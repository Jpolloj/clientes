package com.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages={
"com.example.Service", "com.example.interfaces", "com.example.dto", "com.example.controller" })
@ComponentScan("com.example.Service")
@ComponentScan("com.example.interfaces")
@ComponentScan("com.example.dto")
@ComponentScan("com.example.controller")
public class ClientesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientesApplication.class, args);
	}
}
