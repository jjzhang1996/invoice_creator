package com.jiajunzhang.invoicecreateor.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {
    @GetMapping("/authenticated")
    public ResponseEntity<String> getAuthenticated(){
        return ResponseEntity.ok("You are authenticated.");
    }
}
