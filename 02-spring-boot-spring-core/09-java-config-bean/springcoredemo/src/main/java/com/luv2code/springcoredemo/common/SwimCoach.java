package com.luv2code.springcoredemo.common;

public class SwimCoach implements Coach {
    public SwimCoach() {
        System.out.println(">>>" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "🌊🌊🌊🌊🌊🌊🌊🌊";
    }
}
