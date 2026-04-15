package com.devsenior.transporfare.model;

public class Trip {

    private Long id;
    private double duration;
    private FareType fareType;
    private Double totalFare;
    private String userEmail;
    private double distance;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public double getDuration() {
        return duration;
    }
    public void setDuration(double duration) {
        this.duration = duration;
    }
    public FareType getFareType() {
        return fareType;
    }
    public void setFareType(FareType fareType) {
        this.fareType = fareType;
    }
    public Double getTotalFare() {
        return totalFare;
    }
    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public double getDistance() {
        return distance;
    }
    public void setDistance(double distance) {
        this.distance = distance;
    }

}
