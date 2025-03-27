package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class TeacherController {

    private String name = "Mr. John";
    private String subject = "Mathematics";

    @GetMapping("/teacher")
    public String getTeacher() {
        return "Teacher: " + name + ", Subject: " + subject;
    }
}
