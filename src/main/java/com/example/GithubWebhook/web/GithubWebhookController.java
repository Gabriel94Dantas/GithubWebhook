package com.example.GithubWebhook.web;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/webhook")
public class GithubWebhookController {
    
    @PostMapping("/event")
    public ResponseEntity<String> receiveEvent(@RequestBody String payload){
        System.out.println(payload);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Accepted");
    }

}
