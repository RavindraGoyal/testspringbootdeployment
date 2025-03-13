package com.testdeployment.test.controller;

import com.testdeployment.test.model.Test;
import com.testdeployment.test.service.NameAgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Hello {

    @Autowired
    NameAgeService nameAgeService;

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

    @PostMapping("/add-name-age")
    public Test AddNameAge(@RequestBody Test test){
        return nameAgeService.AddNameAge(test);
    }

    @GetMapping("/get-name-age/{id}")
    public Optional<Test> getNameAge(@PathVariable Integer id){
        return nameAgeService.getNameAge(id);
    }

}
