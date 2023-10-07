package com.saravana.spring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

@RestController
@RequestMapping("tfc/api/v1")
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<String> getAllBookingSources() {
        return ResponseEntity.ok().body("Welcome to Transport and Freight Cost");
    }
}
