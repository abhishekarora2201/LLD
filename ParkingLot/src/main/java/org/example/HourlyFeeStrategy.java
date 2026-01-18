package org.example;

public class HourlyFeeStrategy implements ParkingFeeStrategy{
    @Override
    public double calculateFee(Ticket ticket) {
        long duration = ticket.exitTime - ticket.entryTime;
        long hours = duration/60;
        double fee = 1;
        if(ticket.vehicle.type == VehichleType.Car){
            fee = hours * 40;
        } else if (ticket.vehicle.type == VehichleType.Bike) {
            fee = hours * 20;
        }
        return fee;
    }
}
