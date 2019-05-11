package com.sda.principlesOOP.inheritance.polymorphism;

public class Car extends Vehicle {
    private boolean convertible;
    //    acees la metoda din parinte
    String manufacturer = "Ferrari";

    public Car(int maxSpeed, boolean convertible) {
        super(maxSpeed);
        this.convertible = convertible;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public String toString() {
        return "Car is convertible: " + convertible + "; and has max speed: " + super.getMaxSpeed() +
                " and manufacturer is: " + super.manufacturer;
    }
}
