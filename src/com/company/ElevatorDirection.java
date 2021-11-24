package com.company;

public enum ElevatorDirection {
    UP(1), DOWN(-1);

    private final int value;
    private ElevatorDirection(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
