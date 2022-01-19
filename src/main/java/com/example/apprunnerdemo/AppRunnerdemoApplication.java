package com.example.apprunnerdemo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppRunnerdemoApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(AppRunnerdemoApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Hello World from App Runner");
    }
}
