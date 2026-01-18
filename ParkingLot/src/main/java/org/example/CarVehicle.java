package org.example;

public class CarVehicle extends Vehicle{
    public CarVehicle(String licensePlate){
        this.type = VehichleType.Car;
        this.licensePlate = licensePlate;
    }
}
