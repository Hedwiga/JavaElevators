package com.company;

import java.util.LinkedHashSet;


public interface IElevatorStrategy {
    public LinkedHashSet<Integer> buildRoute(IElevator floor);
}
