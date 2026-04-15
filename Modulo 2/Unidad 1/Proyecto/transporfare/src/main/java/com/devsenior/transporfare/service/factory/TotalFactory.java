package com.devsenior.transporfare.service.factory;

import org.springframework.stereotype.Component;

import com.devsenior.transporfare.dto.TripRequest;
import com.devsenior.transporfare.model.FareType;
import com.devsenior.transporfare.service.implementation.EconomicFareStrategy;
import com.devsenior.transporfare.service.implementation.PremiumFareStrategy;
import com.devsenior.transporfare.service.implementation.SurgeFareStrategy;

@Component
public class TotalFactory {

    private final EconomicFareStrategy economicFareStrategy;
    private final PremiumFareStrategy premiumFareStrategy;
    private final SurgeFareStrategy surgeFareStrategy;

    public TotalFactory(EconomicFareStrategy economicFareStrategy, PremiumFareStrategy premiumFareStrategy, SurgeFareStrategy surgeFareStrategy){
        this.economicFareStrategy = economicFareStrategy;
        this.premiumFareStrategy = premiumFareStrategy;
        this.surgeFareStrategy = surgeFareStrategy;
    }

    public double calculateFare(TripRequest tripRequest){

        double distance = tripRequest.getDistance();
        double duration = tripRequest.getDuration();
        FareType fareType = FareType.valueOf(tripRequest.getFareType());

        switch (fareType) {
            case ECONOMY:
                return economicFareStrategy.calculateFare(distance, duration);

            case PREMIUM:
                return premiumFareStrategy.calculateFare(distance, duration);

            case SURGE:
                return surgeFareStrategy.calculateFare(distance, duration);
        
            default:
                throw new IllegalArgumentException("Tipo de tarifa inválida");
        }

    }

}
