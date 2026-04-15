package com.devsenior.transporfare.service.implementation;

import org.springframework.stereotype.Component;

import com.devsenior.transporfare.service.FareStrategy;

@Component
public class EconomicFareStrategy implements FareStrategy {

    @Override
    public double calculateFare(double distance, double duration) {
     
        return distance * 0.1 + duration * 0.5;

    }

}
