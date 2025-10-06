package com.online;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(
	    info = @Info(
	        title = "User Management API",
	        version = "1.0",
	        description = "APIs for managing users",
	        contact = @Contact(name = "LavetiJagapatibabu", email = "jagapati.laveti@gmail.com")
	    ),
	    servers = {
	        @Server(url = "http://localhost:8080", description = "Local server")
	    }
	)

public class ECommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceApplication.class, args);
	}
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
