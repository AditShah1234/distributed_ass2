package com.assignment2.grpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.assignment2.grpc.DAO.config.mongoClient;

@SpringBootApplication
public class GrpcApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrpcApplication.class, args);
	}


}
