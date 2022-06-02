package com.kcbgroup.apiprojectuno.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("hello/{id}")
    public String helloWorld(@PathVariable int id){
        return "Hello World " + "my id is " + id;
    }


}
