package com.devsenior.transporfare.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.devsenior.transporfare.dto.TripRequest;
import com.devsenior.transporfare.model.Trip;

public interface ITripController {

    public ResponseEntity<Trip> createTrip(TripRequest tr);
    public ResponseEntity<List<Trip>> listTrips(TripRequest tr);

}
