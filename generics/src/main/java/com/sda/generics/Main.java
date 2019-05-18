package com.sda.generics;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new LinkedList<String>();
        String text = "asd";
        int numar = 1;
        strings.add(text);

        List listaDeStringuri = new LinkedList();
        listaDeStringuri.add(text);
        listaDeStringuri.add(numar);

        System.out.println("=======================================================");

        Car car = new Car(150);
        Box<Object> box = new Box<>(car);

        Box<Car> carbox = new Box<>(car);
        Car carRetrieved = carbox.getObject();
        carRetrieved.getMaxSpeed();

        GenericBox<AVehicle> genericBox = new GenericBox<>(car);
        AVehicle vehicle = genericBox.getT();

        GenericBox<String> stringGenericBox = new GenericBox<>("asd");
        String string = stringGenericBox.getT();

        Car dacia = new Car(180);
        Car audiA3 = new Car(197);

        int compareResult = dacia.compareTo(audiA3);
        if (compareResult < 0) {
            System.out.println("Audi e mai rapid");
        } else if (compareResult > 0) {
            System.out.println("Dacia e mai rapida");
        } else {
            System.out.println("Vitezele sunt egale");
        }

//        Putem sa punem in garaj1 orice clasa care extinde AVehcile - consumer
//        Nu avem voie sa apelam setteri.
        GenericBox<? extends AVehicle> garaj1 = new GenericBox<Car>(dacia);
//        Putem sa punem in garaj2 orice parinte a lui Car(clase care sunt extinse de care) - producer
        GenericBox<? super Car> garaj2 = new GenericBox<AVehicle>(audiA3);

        Car ferarri = new Car(320);
//        garaj1.setT(ferarri);
        garaj2.setT(ferarri);
    }
}
