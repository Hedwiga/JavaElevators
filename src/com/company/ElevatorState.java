package com.company;

public abstract class ElevatorState {
    protected Elevator elevator;

    ElevatorState(Elevator elevator) {
        this.elevator = elevator;
    }
    public abstract void onFloor(IFloor floor);
    public abstract void onMove();
    public abstract void onStatus();

    public void checkOnFloor(int floor) {
        elevator.changeFloor();
    }
}
