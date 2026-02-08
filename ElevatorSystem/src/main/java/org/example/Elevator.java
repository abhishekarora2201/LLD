package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Elevator {
    private int id;
    private int currentFloor;
    private Direction direction;
    private ElevatorState state;
    List<ElevatorObservers> observers;
    Queue<Requests> requests;

    public Elevator(int id){
        this.id = id;
        this.currentFloor = 0;
        this.direction = Direction.UP;
        this.state = ElevatorState.IDLE;
        this.observers = new ArrayList<>();
        this.requests = new LinkedList<>();
    }

    public void addRequest(){

    }
}
