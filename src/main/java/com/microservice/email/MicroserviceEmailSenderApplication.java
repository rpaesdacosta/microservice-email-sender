package com.microservice.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MicroserviceEmailSenderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceEmailSenderApplication.class, args);
    }

    @GetMapping("/info")
    public String index() {
        return "A microservice email sender";
    }
}
