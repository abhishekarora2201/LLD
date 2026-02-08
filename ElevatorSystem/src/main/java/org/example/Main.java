package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SchedulingStrategy strategy = new FCFS();
        Building building = new Building("Elante", 2, 5, strategy);
        ElevatorController controller = building.getElevatorController();


    }
}