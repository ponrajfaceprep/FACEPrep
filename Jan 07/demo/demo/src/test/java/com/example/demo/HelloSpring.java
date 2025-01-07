package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpring {
    @RequestMapping("/")
    public String sayHello() {
        return "Hello Spring";
    }
}
