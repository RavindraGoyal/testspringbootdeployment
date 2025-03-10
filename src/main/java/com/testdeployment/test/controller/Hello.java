package com.testdeployment.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/hello")
    public  String PrintHello(){
        return "Hello";
    }

    @GetMapping("/name/{name}")
    public String PrintName(@PathVariable String name){
        return "Hello " + name;
    }

    @GetMapping("/test-api/{name}")
    public String TestAPI(@PathVariable String name){
        return "Test API " + name;
    }

}
