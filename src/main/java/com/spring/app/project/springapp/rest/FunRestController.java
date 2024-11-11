package com.spring.app.project.springapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //    expose Endpoints
    @GetMapping("/")
    public String sayHello() {
        return "Hello world";
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    //    assign value from application.properties
    @Value("${coach.name}")
    private String coachName;

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "The coach is " + coachName + " and the team is " + teamName;
    }

    @Value("${team.name}")
    private String teamName;

}
