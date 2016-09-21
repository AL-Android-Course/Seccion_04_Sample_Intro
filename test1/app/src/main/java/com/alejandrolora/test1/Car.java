package com.alejandrolora.test1;

/**
 * Created by Alejandro on 13/9/16.
 */
public class Car {

    private int VIN;
    private String name;
    private String color;

    public Car(int VIN, String name, String color) {
        this.VIN = VIN;
        this.name = name;
        this.color = color;
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
