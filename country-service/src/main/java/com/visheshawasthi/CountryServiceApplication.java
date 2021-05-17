package com.visheshawasthi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients
@SpringBootApplication
public class CountryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CountryServiceApplication.class, args);
    }

}
