package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.sound.midi.Track;

//NOTE: @Primary has a LOWER priority than @Qualifier
@Component
public class TrackCoach implements Coach{
    public TrackCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k?";
    }
}
