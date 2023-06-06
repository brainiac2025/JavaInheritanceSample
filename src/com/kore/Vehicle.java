package com.kore;

public class Vehicle {
    private String name;
    private String wheelType;
    private String type;

    public Vehicle(String name, String wheelType, String type) {
        this.name = name;
        this.wheelType = wheelType;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getWheelType() {
        return wheelType;
    }

    public String getType() {
        return type;
    }
}
