package com.example.demo;

import org.flowable.spring.boot.FlowableSecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication(exclude = {
        SecurityAutoConfiguration.class,
        FlowableSecurityAutoConfiguration.class
})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
