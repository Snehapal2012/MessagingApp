package com.example.messageapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessageAppApplication {

    public static void main(String[] args) {
        System.out.println("Welcome to message app project!");
        SpringApplication.run(MessageAppApplication.class, args);
    }

}
