package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController  // Marks this class as a REST controller
@RequestMapping("/")  // Base URL for all mappings in this class
public class Controller {

    @GetMapping("/home")
    public String home() {
        return "Welcome to Home Page!";
    }

    @GetMapping("/services")
    public String services() {
        return "<h2>Our Services</h2>"
                + "<ul>"
                + "<li>Web Development</li>"
                + "<li>Mobile App Development</li>"
                + "<li>SEO Optimization</li>"
                + "</ul>";
    }

    @GetMapping("/about")
    public String about(){
        return "About";
    }

    @GetMapping("/faq")
    public String faq(){
        return "FAQ";
    }

    @GetMapping("contact-us")
    public String contact(){
        return "Contact";
    }

    @GetMapping("/team")
    public String team(){
        return "Team";
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    // Calculate square of a number
    @GetMapping("/square/{num}")
    public String square(@PathVariable int num) {
        return "The square of " + num + " is " + (num * num) + ".";
    }

    // Return double the given number
    @GetMapping("/double/{num}")
    public String doubleValue(@PathVariable int num) {
        return "Double of " + num + " is " + (num * 2) + ".";
    }

    // Return length of the given text
    @GetMapping("/length/{text}")
    public String textLength(@PathVariable String text) {
        return "The length of '" + text + "' is " + text.length() + ".";
    }

    // Reverse the given text
    @GetMapping("/reverse/{text}")
    public String reverseText(@PathVariable String text) {
        return "Reversed: " + new StringBuilder(text).reverse().toString();
    }

    // Concatenate two strings
    @GetMapping("/concat/{str1}/{str2}")
    public String concatStrings(@PathVariable String str1, @PathVariable String str2) {
        return "Concatenated: " + str1 + str2;
    }

    @GetMapping("/add/{x}/{y}")
    public String add(@PathVariable int x, @PathVariable int y) {
        return "The sum of " + x + " and " + y + " is " + (x + y) + ".";
    }

    // Multiply two numbers
    @GetMapping("/multiply/{x}/{y}")
    public String multiply(@PathVariable int x, @PathVariable int y) {
        return "The product of " + x + " and " + y + " is " + (x * y) + ".";
    }

    // Subtract two numbers
    @GetMapping("/subtract/{x}/{y}")
    public String subtract(@PathVariable int x, @PathVariable int y) {
        return "The difference between " + x + " and " + y + " is " + (x - y) + ".";
    }

    // Divide two numbers (handle division by zero)
    @GetMapping("/divide/{x}/{y}")
    public String divide(@PathVariable int x, @PathVariable int y) {
        if (y == 0) {
            return "Division by zero is not allowed.";
        }
        return x + " divided by " + y + " is " + ((double) x / y) + ".";
    }

    // Get remainder (modulus)
    @GetMapping("/modulus/{x}/{y}")
    public String modulus(@PathVariable int x, @PathVariable int y) {
        if (y == 0) {
            return "Modulus by zero is not allowed.";
        }
        return "The remainder of " + x + " divided by " + y + " is " + (x % y) + ".";
    }

    // Calculate power (base^exp)
    @GetMapping("/power/{base}/{exp}")
    public String power(@PathVariable int base, @PathVariable int exp) {
        return base + " raised to the power of " + exp + " is " + Math.pow(base, exp) + ".";
    }

}