package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ParkingSlot> parkingSlots = new ArrayList<>();
        parkingSlots.add(new ParkingSlot(1, VehichleType.Car));
        parkingSlots.add(new ParkingSlot(2, VehichleType.Car));
        parkingSlots.add(new ParkingSlot(3, VehichleType.Car));
        parkingSlots.add(new ParkingSlot(4, VehichleType.Bike));
        parkingSlots.add(new ParkingSlot(5, VehichleType.Bike));

        SlotAllocationStrategy slotAllocationStrategy = new BasicSlotAllocationStrategy();
        PaymentStrategy paymentStrategy = new CashPaymentStrategy();
        ParkingFeeStrategy parkingFeeStrategy = new HourlyFeeStrategy();

        ParkingLot parkingLot = new ParkingLot(parkingSlots, slotAllocationStrategy, parkingFeeStrategy, paymentStrategy);

        Vehicle car = new CarVehicle("CH01DB6622");
        Vehicle car2 = new CarVehicle("CH01DB6623");
        Vehicle car3 = new CarVehicle("CH01DB6624");
        Vehicle car4 = new CarVehicle("CH01DB6625");

        Ticket ticket = parkingLot.parkVehicle(car);
        Ticket ticket2 = parkingLot.parkVehicle(car2);
        parkingLot.vacateSpot(ticket);
        Ticket ticket3 = parkingLot.parkVehicle(car3);
        Ticket ticket4 = parkingLot.parkVehicle(car4);
        Ticket ticket5 = parkingLot.parkVehicle(car4);
    }
}