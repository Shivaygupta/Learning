package com.example.Transaction.Entities;

import com.example.Transaction.VehicleStatus;
import com.example.Transaction.VehicleType;

import java.util.HashSet;
import java.util.Set;

public class Vehicle {

    Set<Vehicle> vehicleSet = new HashSet<>();


    String name;
    VehicleType vehicleType;

    VehicleStatus vehicleStatus;

}
