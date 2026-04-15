package com.devsenior.transporfare.repository;

import java.util.List;

import com.devsenior.transporfare.model.Trip;

public interface ITripRepository {

    public Trip save(Trip trip);
    public List<Trip> findAll();

}
