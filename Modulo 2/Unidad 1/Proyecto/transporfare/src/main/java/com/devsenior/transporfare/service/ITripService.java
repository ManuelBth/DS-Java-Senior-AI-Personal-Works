package com.devsenior.transporfare.service;

import java.util.List;

import com.devsenior.transporfare.dto.TripRequest;
import com.devsenior.transporfare.model.Trip;

public interface ITripService {

    public Trip createTrip(TripRequest tripRequest);
    public List<Trip> listTrips();

}
