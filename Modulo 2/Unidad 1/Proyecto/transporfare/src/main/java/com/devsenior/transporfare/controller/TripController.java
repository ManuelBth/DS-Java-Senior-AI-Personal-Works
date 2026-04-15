package com.devsenior.transporfare.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsenior.transporfare.dto.TripRequest;
import com.devsenior.transporfare.model.Trip;
import com.devsenior.transporfare.service.ITripService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/trips")
public class TripController implements ITripController {

    private final ITripService service;

    // Constructor
    public TripController (ITripService tripService){
        this.service = tripService;
    }


    @Override
    @PostMapping
    public ResponseEntity<Trip> createTrip(@Valid @RequestBody TripRequest tr) {

        Trip trip = service.createTrip(tr);
        return ResponseEntity.status(201).body(trip);

    }


    @Override
    @GetMapping
    public ResponseEntity<List<Trip>> listTrips(TripRequest tr) {
        
        List<Trip> trips = service.listTrips();
        return ResponseEntity.ok(trips);

    }


}
