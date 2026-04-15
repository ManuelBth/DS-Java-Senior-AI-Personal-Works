package com.devsenior.transporfare.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.devsenior.transporfare.dto.TripRequest;
import com.devsenior.transporfare.model.FareType;
import com.devsenior.transporfare.model.Trip;
import com.devsenior.transporfare.repository.ITripRepository;
import com.devsenior.transporfare.service.factory.TotalFactory;

@Service
public class TripService implements ITripService{

    private final ITripRepository tripRepository;
    private final TotalFactory totalFactory;


    // Constructor
    public TripService(ITripRepository tripRepository, TotalFactory trFactory){
        this.tripRepository = tripRepository;
        this.totalFactory = trFactory;
    }

    @Override
    public Trip createTrip(TripRequest tripRequest){

        FareType fareType = FareType.valueOf(tripRequest.getFareType());
        
        double total = totalFactory.calculateFare(tripRequest);

        Trip trip = new Trip();
        
        trip.setDistance(tripRequest.getDistance());
        trip.setDuration(tripRequest.getDuration());
        trip.setFareType(fareType);
        trip.setTotalFare(total);
        trip.setUserEmail(tripRequest.getUserEmail());
        
        tripRepository.save(trip);

        return trip;
    }

    @Override
    public List<Trip> listTrips(){
        
        return tripRepository.findAll()
        .stream()
        .sorted(Comparator.comparing(Trip::getTotalFare).reversed())
        .toList();
    }







}
