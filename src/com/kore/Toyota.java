package com.kore;

public class Toyota extends Car {
    private String engineNo;
    private int ManufactureYear;
    private String transmissionType;
    private int seatNumber;

    public Toyota(String name, String wheelType, String engineType, String maker, String color, String engineNo, int manufactureYear, String transmissionType, int seatNumber) {
        super(name, wheelType, engineType, maker, color);
        this.engineNo = engineNo;
        ManufactureYear = manufactureYear;
        this.transmissionType = transmissionType;
        this.seatNumber = seatNumber;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public int getManufactureYear() {
        return ManufactureYear;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public int getSeatNumber() {
        return seatNumber;
    }


}
