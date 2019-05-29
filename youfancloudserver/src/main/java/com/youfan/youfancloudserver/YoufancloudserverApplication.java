package com.youfan.youfancloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class YoufancloudserverApplication {

	public static void main(String[] args) {

		SpringApplication.run(YoufancloudserverApplication.class, args);
	}

}
