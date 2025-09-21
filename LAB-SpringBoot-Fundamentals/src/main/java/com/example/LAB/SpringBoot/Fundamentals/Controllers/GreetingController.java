package com.example.LAB.SpringBoot.Fundamentals.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/hello")
    public static String greeting(){
        return "Hello World";
    }

    @GetMapping("/hello/{name}")
    public static String greeting_name(@PathVariable String name){
        return "Hello " + name + "!";
    }

    @GetMapping("/add/{num1}/{num2}")
    public static int add(@PathVariable int num1,@PathVariable int num2){
        return num1+num2;
    }

    @GetMapping("/multiply/{num1}/{num2}")
    public static int multiply(@PathVariable int num1,@PathVariable int num2){
        return num1*num2;
    }

}
