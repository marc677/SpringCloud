package com.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTemplateApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestTemplateApplication.class, args);
    }

    //在Spring Boot启动时，构造返回一个RestTemplate对象
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}