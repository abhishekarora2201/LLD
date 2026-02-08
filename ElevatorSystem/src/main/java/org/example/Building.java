package org.example;

public class Building {
    private String name;
    private int numberOfFloors;
    private int numberOfElevators;
    private ElevatorController elevatorController;

    public Building(String name, int numberOfElevators,int numberOfFloors, SchedulingStrategy strategy){
        this.name = name;
        this.numberOfFloors = numberOfFloors;
        this.elevatorController = new ElevatorController(numberOfElevators, numberOfFloors, strategy);
    }

    public ElevatorController getElevatorController(){
        return this.elevatorController;
    }

}
