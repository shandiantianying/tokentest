package com.sdty.tokentest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class TokentestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TokentestApplication.class, args);
    }

}
