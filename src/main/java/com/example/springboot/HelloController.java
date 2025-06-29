package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello() {
        String date = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(new Date());
        return "Hello, Spring Boot!\nToday is: " + date;
    }
}