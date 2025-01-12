package org.example.envvartest.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${env.hello-message}")
    private String hello_message;

    @GetMapping
    public String hello() {
        return "Hello message: " + hello_message;
    }
}
