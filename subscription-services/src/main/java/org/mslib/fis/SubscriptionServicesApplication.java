package org.mslib.fis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SubscriptionServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubscriptionServicesApplication.class, args);
	}

}
