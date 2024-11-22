package org.mslib.fis;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AllApiGatewayConfiguration {
	
	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p -> p.path("/books/**").uri("lb://books"))
				.route(p -> p.path("/bookInquiry/**").uri("lb://subscription-services"))
				.route(p -> p.path("/bookInquiry-feign/**").uri("lb://subscription-services"))
				.build();
	}

}
