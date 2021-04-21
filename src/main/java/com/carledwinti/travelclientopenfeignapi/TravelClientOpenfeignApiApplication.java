package com.carledwinti.travelclientopenfeignapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TravelClientOpenfeignApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelClientOpenfeignApiApplication.class, args);
	}

}
