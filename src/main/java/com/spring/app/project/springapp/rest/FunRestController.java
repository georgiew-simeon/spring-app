package com.spring.app.project.springapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //    expose "/" endpoints returning "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello world";
    }
}
