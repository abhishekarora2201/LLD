package org.example;

import java.util.List;

public class ParkingLot {
    List<ParkingSlot> parkingSlots;
    SlotAllocationStrategy slotAllocationStrategy;
    ParkingFeeStrategy parkingFeeStrategy;
    PaymentStrategy paymentStrategy;

    public ParkingLot(List<ParkingSlot> parkingSlots, SlotAllocationStrategy slotAllocationStrategy, ParkingFeeStrategy parkingFeeStrategy, PaymentStrategy paymentStrategy){
        this.parkingSlots = parkingSlots;
        this.slotAllocationStrategy = slotAllocationStrategy;
        this.parkingFeeStrategy = parkingFeeStrategy;
        this.paymentStrategy = paymentStrategy;
    }

    public ParkingSlot findSpot(VehichleType vehichleType){
        return null;
    }

    public Ticket parkVehicle(Vehicle vehicle) {
        ParkingSlot slot = slotAllocationStrategy.findSpot(vehicle.type, parkingSlots);
        if(slot == null){
            System.out.println("Parking not possible");
            return null;
        }
        Ticket ticket = new Ticket(slot.slotNumber, vehicle, slot);
        System.out.println("Vehicle parked at slot number: " + slot.slotNumber);
        return ticket;
    }

    public void vacateSpot(Ticket ticket) {
        if(ticket ==  null)
        {
            System.out.println("Invalid Ticket");
            return;
        }
        ticket.exitTime = System.currentTimeMillis();
        double fee = parkingFeeStrategy.calculateFee(ticket);
        boolean payment = paymentStrategy.processPayment(fee);
        if (payment){
            System.out.println("Vehicle parked at slot: " + ticket.slot.slotNumber + " has exited");
            ticket.slot.isOccupied = false;
        }
        else {
            System.out.println("Payment unsuccessful");
        }
    }

}
