package org.example;

public class Ticket {
    protected int ticketID;
    protected Vehicle vehicle;
    protected ParkingSlot slot;
    protected long entryTime;
    protected long exitTime;

    public Ticket(int ticketID, Vehicle vehicle, ParkingSlot slot){
        this.ticketID = ticketID;
        this.vehicle = vehicle;
        this.slot = slot;
        this.entryTime = System.currentTimeMillis();
    }

}
