package com.daggerok.service;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringCloudApplication
public class CloudService {
    public static void main(String[] args) {
        SpringApplication.run(CloudService.class, args);
    }
}
