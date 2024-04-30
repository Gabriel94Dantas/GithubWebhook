package com.example.GithubWebhook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AutoConfiguration
public class GithubWebhook{

    public static void main(String[] args){
        SpringApplication.run(GithubWebhook.class, args);
    }

}