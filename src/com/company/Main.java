package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        var elevators = new ArrayList<ElevatorConfiguration>();
//        for(int i = 0; i < 2; ++i) {
//            elevators.add(new ElevatorConfiguration(new PlainStrategy(), 0, 1000, 4, 500));
        elevators.add(new ElevatorConfiguration(new PlainStrategy(), 1, 3000, 4, 500));
//        }
        BuildingConfiguration.setInstance(elevators, 4, 10000);
        var buildingConfiguration = BuildingConfiguration.getInstance();

        var building = new Building(buildingConfiguration);
    }
}
