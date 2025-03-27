package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class BookController {

    private String title = "Java for Beginners";
    private String author = "John Doe";
    private double price = 29.99;

    @GetMapping("/book")
    public String getBook() {
        return "Book: " + title + ", Author: " + author + ", Price: $" + price;
    }
}
