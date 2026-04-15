package com.devsenior.transporfare.service.implementation;

import org.springframework.stereotype.Component;

import com.devsenior.transporfare.service.FareStrategy;

@Component
public class SurgeFareStrategy implements FareStrategy {

    private static final double SURGE_FARE = 1.5;

    @Override
    public double calculateFare(double distance, double duration) {
     
        return (distance * 1.5 + duration * 0.75) * SURGE_FARE;

    }

}