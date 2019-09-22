package com.sda.cars;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double km;

    public Car(String brand, String model, int year, double km) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.km = km;
    }

    String print() {
        return (brand + " " + model + " " + year + " " + km);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getKm() {
        return km;
    }
}
