package com.example.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloHumanController {


    @RequestMapping("/")
    public String index(@RequestParam(defaultValue="Human", required = false) String first_name,@RequestParam(defaultValue="",required = false) String last_name){
        return "Hello " + first_name + " " + last_name;
    }
}
