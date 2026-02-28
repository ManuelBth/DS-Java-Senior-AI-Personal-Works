package com.devsenior.manuel.model;

import com.devsenior.manuel.model.enums.UrgencyLevel;

public class Order {

    private final String id;
    private final double weightInKg;
    private final UrgencyLevel urgency;

    public Order(String id, double weightInKg, UrgencyLevel urgency) {
        this.id = id;
        this.weightInKg = weightInKg;
        this.urgency = urgency;
    }

    public String getId() {
        return id;
    }

    public double getWeightInKg() {
        return weightInKg;
    }

    public UrgencyLevel getUrgency() {
        return urgency;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", weightInKg=" + weightInKg + ", urgency=" + urgency + "]";
    }

}
