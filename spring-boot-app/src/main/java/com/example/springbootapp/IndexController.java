package com.example.springbootapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping(name = "/")
    public String index(){
        return "Welcome to my website!";
    }
}
