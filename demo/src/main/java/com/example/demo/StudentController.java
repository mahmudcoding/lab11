package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class StudentController {

    private String name = "Ali";
    private int age = 21;

    @GetMapping("/student")
    public String getStudent() {
        return "Student: " + name + ", Age: " + age;
    }

    @GetMapping("/is-adult/{age}")
    public String isAdult(@PathVariable int age) {
        return "Age " + age + ": " + (age >= 18 ? "You are an adult." : "You are not an adult.");
    }

    @PutMapping("/update-student/{age}")
    public String updateAge(@PathVariable int age) {
        this.age = age;
        return "Student age updated to " + this.age;
    }
}