package com.company;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {
        var elevators = new ArrayList<ElevatorConfiguration>();
        for(int i = 0; i < 2; ++i) {
            elevators.add(new ElevatorConfiguration(new PlainStrategy(), 0, (i + 1)*1000, 4, 500));
        }
        BuildingConfiguration.setInstance(elevators, 3, 10000);
        var buildingConfiguration = BuildingConfiguration.getInstance();

        var building = new Building(buildingConfiguration);
    }
}
