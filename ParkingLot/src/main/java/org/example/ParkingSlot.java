package org.example;

public class ParkingSlot {
    protected int slotNumber;
    protected boolean isOccupied;
    protected VehichleType slotType;

    public ParkingSlot(int slotNumber, VehichleType slotType){
        this.isOccupied = false;
        this.slotNumber = slotNumber;
        this.slotType = slotType;
    }

}
