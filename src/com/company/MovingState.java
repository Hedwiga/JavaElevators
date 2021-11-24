package com.company;

import java.util.Iterator;

public class MovingState extends ElevatorState {
    MovingState(Elevator elevator) {
        super(elevator);
    }

    @Override
    public void onFloor(IFloor floor) {
        // To safely remove
        Iterator<Passenger> i = floor.getPassengers().iterator();
        while (i.hasNext()) {
            var passenger = i.next();
            boolean isAdded = elevator.addPassenger(passenger);
            if(isAdded)
                i.remove();
        }
    }

    @Override
    public void onMove() {

    }

    @Override
    public void onStatus() {

    }
}
