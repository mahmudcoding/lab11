package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class CourseController {

    private String title = "Spring Boot";
    private int duration = 6; // in weeks

    @GetMapping("/course")
    public String getCourse() {
        return "Course: " + title + ", Duration: " + duration + " weeks";
    }
}
