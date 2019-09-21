package com.sda.cars;

public class Car {
    String brand;
    String model;
    int year;
    double km;

    Car(String brand, String model, int year, double km) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.km = km;
    }

    String print() {
        StringBuilder builder = new StringBuilder();
        return builder.append(brand + " " + model + " " + year + " " + km).toString();
    }
}
