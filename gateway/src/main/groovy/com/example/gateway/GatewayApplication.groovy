package com.example.gateway

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.gateway.route.RouteLocator
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.context.annotation.Bean

@SpringBootApplication
class GatewayApplication {

	static void main(String[] args) {
		SpringApplication.run(GatewayApplication, args)
	}

//	@Bean
//	public RouteLocator routes(RouteLocatorBuilder builder) {
//		return builder.routes().route("service1", { r ->
//					r.path("/api/**")
//							.filters({ f ->
//								f.circuitBreaker({ c -> c.name('testCircuitBreaker').fallbackUri("forward:/api/fallback") })
//							}).uri("lb://service1")
//							.build();
//				});
//	}

}
