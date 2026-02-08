package org.example;

import java.util.ArrayList;
import java.util.List;

public class ElevatorController {
    private List<Elevator> elevators;
    private List<Floor> floors;
    private SchedulingStrategy strategy;

    public ElevatorController(int numberOfElevators, int numberOfFloors, SchedulingStrategy strategy){
        this.elevators = new ArrayList<>();
        for (int i = 0; i < numberOfElevators; i++) {
            Elevator elevator = new Elevator(i);
            this.elevators.add(elevator);
        }
        this.floors = new ArrayList<>();
        for (int i = 0; i < numberOfFloors; i++) {
            Floor floor = new Floor(i);
            this.floors.add(floor);
        }
        this.strategy = strategy;
    }

    public void requestElevator(){

    }

    public void requestFloor(){

    }

    public void step(){

    }
}
