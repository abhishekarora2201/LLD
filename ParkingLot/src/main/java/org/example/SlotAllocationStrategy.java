package org.example;

import java.util.List;

public interface SlotAllocationStrategy {
    public ParkingSlot findSpot(VehichleType type, List<ParkingSlot> slots);
}
