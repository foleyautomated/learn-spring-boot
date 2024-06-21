package com.example.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" that returns 'Hwllo World'

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
