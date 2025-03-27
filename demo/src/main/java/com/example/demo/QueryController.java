package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class QueryController {

    // Task 5: Handling Query Parameters
    @GetMapping("/greet")
    public String greet(@RequestParam(name = "name", defaultValue = "Guest") String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/calculate")
    public String calculate(@RequestParam int x, @RequestParam int y, @RequestParam String operation) {
        switch (operation.toLowerCase()) {
            case "add":
                return "Result: " + (x + y);
            case "subtract":
                return "Result: " + (x - y);
            case "multiply":
                return "Result: " + (x * y);
            case "divide":
                return y != 0 ? "Result: " + (x / (double) y) : "Cannot divide by zero!";
            default:
                return "Invalid operation!";
        }
    }

    @GetMapping("/filter")
    public String filter(@RequestParam String keyword, @RequestParam String category) {
        return "Filtering results for keyword: " + keyword + " in category: " + category;
    }

    @GetMapping("/convert")
    public String convertTemperature(@RequestParam double temperature) {
        double fahrenheit = (temperature * 9 / 5) + 32;
        return "Temperature in Fahrenheit: " + fahrenheit;
    }

    @GetMapping("/discount")
    public String calculateDiscount(@RequestParam double originalPrice, @RequestParam double discountRate) {
        double discountedPrice = originalPrice - (originalPrice * discountRate / 100);
        return "Discounted price: $" + discountedPrice;
    }

    // Task 6: Working with JSON Responses
    @GetMapping("/student-info")
    public Map<String, Object> getStudentInfo() {
        Map<String, Object> response = new HashMap<>();
        response.put("name", "Ali");
        response.put("age", 21);
        response.put("status", "active");
        return response;
    }
}
