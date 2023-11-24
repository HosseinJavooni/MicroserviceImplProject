package com.example.ConfigServerLocally;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerLocallyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerLocallyApplication.class, args);
	}

}
