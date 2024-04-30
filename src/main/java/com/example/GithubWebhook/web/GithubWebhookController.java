package com.example.GithubWebhook.web;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webhook")
public class GithubWebhookController {
    
    @PostMapping("/event")
    public ResponseEntity<String> receiveEvent(@org.springframework.web.bind.annotation.RequestBody String payload){
        System.out.println(payload);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Accepted");
    }

}
