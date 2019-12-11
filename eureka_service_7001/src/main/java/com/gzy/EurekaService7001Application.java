package com.gzy;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class EurekaService7001Application {
    public static void main(String[] args) {
        SpringApplication.run (EurekaService7001Application.class,args );
    }
}
