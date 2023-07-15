package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cab {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int perKmRate;
    private boolean available;
    @JoinColumn
    @OneToOne
    public Driver driver;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    public List<TripBooking> tripBookingList = new ArrayList<>();

    public Cab() {
    }

    public Cab(int perKmRate, boolean available) {
        this.perKmRate = perKmRate;
        this.available = available;
    }


    public int getPerKmRate() {
        return perKmRate;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAvailable() {
        return available;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public List<TripBooking> getTripBookingList() {
        return tripBookingList;
    }

    public void setTripBookingList(List<TripBooking> tripBookingList) {
        this.tripBookingList = tripBookingList;
    }
}