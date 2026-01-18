package org.example;

import java.util.List;

public class BasicSlotAllocationStrategy implements SlotAllocationStrategy {
    @Override
    public ParkingSlot findSpot(VehichleType type, List<ParkingSlot> slots) {
        for(ParkingSlot slot: slots){
            if(!slot.isOccupied && slot.slotType == type){
                slot.isOccupied = true;
                return slot;
            }
        }
        return null;
    }
}
