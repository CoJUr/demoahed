package com.example.demoahed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan({"controller", "service"})
public class DemoahedApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoahedApplication.class, args);
    }

}
