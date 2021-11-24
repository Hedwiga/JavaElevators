package com.company;

import java.util.ArrayList;

public class PlainStrategy implements IElevatorStrategy {
    @Override
    public ArrayList<Integer> buildRoute(IElevator elevator) {
        var route = new ArrayList<Integer>();
        for (var passenger: elevator.getPassengers()) {
            route.add(passenger.getFloorTarget());
        }
        return route;
    }
}
