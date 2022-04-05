package com.example.gateway.controller

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class HystrixFallbackRestController {

    @GetMapping("/api/fallback")
    public Mono<String> getBillingMsg() {
        return Mono.just("No response fron Billing Service and will be back shortly");
    }

}
