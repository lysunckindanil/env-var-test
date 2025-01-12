package org.example.envvartest.controllers;

import org.example.envvartest.entities.Dummy;
import org.example.envvartest.repos.DummyRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final DummyRepository dummyRepository;

    @Value("${env.hello-message}")
    private String hello_message;

    public HelloController(DummyRepository dummyRepository) {
        this.dummyRepository = dummyRepository;
    }

    @GetMapping
    public String hello() {
        return "Hello message: " + hello_message;
    }

    @GetMapping("/add")
    public String addDummy(@RequestParam String name) {
        return dummyRepository.save(new Dummy(name)).toString();
    }

    @GetMapping("/get")
    public String getDummies() {
        return dummyRepository.findAll().toString();
    }
}
