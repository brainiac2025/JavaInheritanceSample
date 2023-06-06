package com.kore;

public class Car extends Vehicle{
    private String engineType;
    private String maker;
    private String color;

    public Car(String name, String wheelType, String engineType, String maker, String color) {
        super(name, wheelType, "sedan");
        this.engineType = engineType;
        this.maker = maker;
        this.color=color;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getMaker() {
        return maker;
    }
    public void move(int speed){
        System.out.println("moving at "+speed+" speed");
    }
}
