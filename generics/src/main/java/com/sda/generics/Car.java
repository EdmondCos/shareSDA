package com.sda.generics;

public class Car extends AVehicle implements Comparable<Car> {
    private int maxSpeed;

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void repair() {
        System.out.println("Car is repaired");
    }

    @Override
    public int compareTo(Car otherCar) {
        return maxSpeed - otherCar.getMaxSpeed();
    }
}
