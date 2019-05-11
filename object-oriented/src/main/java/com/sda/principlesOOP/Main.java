package com.sda.principlesOOP;

import com.sda.principlesOOP.encapsulation.Person;
import com.sda.principlesOOP.inheritance.polymorphism.Car;
import com.sda.principlesOOP.inheritance.polymorphism.Vehicle;

public class Main {
    public static void main(String[] args) {
//        Persons();

        Vehicle vehicle = new Vehicle(220);
        Car car = new Car(320, false);

        System.out.println(vehicle.toString());
        System.out.println(car.toString());

        Vehicle car2 = new Car(180, true);
        car2.setManufacturer("Dacia");
        Vehicle vehicle2 = new Vehicle(2000);

        System.out.println(car2.toString());
        System.out.println(vehicle2.toString());

        System.out.println("================================================================");
        print(vehicle2);
    }

    public static void print(Vehicle input) {
        System.out.println("Received vehicle with" +
                "\nmaxSpeed: " + input.getMaxSpeed() +
                "\nmanufacturer: " + input.getManufacturer());
    }

    private static void Persons() {
        Person person = new Person();

        person.setAge(18);
        System.out.println("Age: " + person.getAge());

        person.setAge(-18);
        System.out.println("Age: " + person.getAge());
    }
}
