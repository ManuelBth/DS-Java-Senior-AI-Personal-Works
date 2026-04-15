package com.devsenior.transporfare.service.implementation;

import org.springframework.stereotype.Component;

import com.devsenior.transporfare.service.FareStrategy;

@Component
public class PremiumFareStrategy implements FareStrategy {

    private static final double PREMIUM_FARE = 2.0;

    @Override
    public double calculateFare(double distance, double duration) {
     
        return distance * PREMIUM_FARE + duration * 1.0;

    }

}