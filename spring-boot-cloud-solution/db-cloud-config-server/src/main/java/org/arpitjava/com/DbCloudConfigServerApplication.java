package org.arpitjava.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class DbCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbCloudConfigServerApplication.class, args);
	}
}
