package com.test1.app1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.test1.app1.error")
public class AppStart {

    public static void main(String[] args) {

        SpringApplication.run(AppStart.class, args);

    }
}