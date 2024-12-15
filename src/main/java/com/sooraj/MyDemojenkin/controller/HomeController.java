package com.sooraj.MyDemojenkin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/test")
    public String getMessage(){
        return "Hello Sooraj";
    }
}
