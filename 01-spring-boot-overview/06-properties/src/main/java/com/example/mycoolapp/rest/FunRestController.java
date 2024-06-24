package com.example.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //Inject propertis for coach.name and team.name

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // expose new endpoint for team info
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + ", Team name: " + teamName;
    }

    // expose "/" that returns 'Hello World'

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!!!!!!!!!!";
    }

    // New endpoint for workout

    @GetMapping("/workout")
    public String getDialyWorkout() {
        return "run a hard 5K!";
    }

    @GetMapping("/weightlift")
    public String getDialyLift() {
        return "Lift 100 Lbs!";
    }

}
