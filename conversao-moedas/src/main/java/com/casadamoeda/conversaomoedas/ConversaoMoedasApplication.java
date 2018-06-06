package com.casadamoeda.conversaomoedas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.casadamoeda.conversaomoedas.infra.proxy")
@EnableDiscoveryClient
public class ConversaoMoedasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConversaoMoedasApplication.class, args);
	}
}
