package com.blz.firstspringapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringApp1Application.class, args);
        System.out.println("Hello From Bridge Labz");
    }
}

