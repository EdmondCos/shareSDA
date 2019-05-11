package com.sda.enums;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Highway a1 = new Highway(LenghtUnit.KILOMETER, 110);
        Highway a2 = new Highway(LenghtUnit.CENTIMETER, 30_000_000);
        Highway a16 = new Highway(LenghtUnit.METER, 1);

        List<Highway> highways = new LinkedList<>();
        highways.add(a1);
        highways.add(a2);
        highways.add(a16);

        for (Highway temp : highways) {
            switch (temp.getUnit()) {
                case METER:
                    System.out.println("A16 has " + temp.getLength() * 0.001 + " km");
                    break;
                case KILOMETER:
                    System.out.println("A1 has " + temp.getLength() + " km");
                    break;
                case CENTIMETER:
                    System.out.println("A2 has " + temp.getLength() * 0.00001 + " km");
                    break;
                default:
                    System.out.println("unit not recognized");
            }
        }

        printEnumValues();
    }

    static void printEnumValues(){
        LenghtUnit[] unit = LenghtUnit.values();
        for (LenghtUnit temp : unit){
            System.out.println(temp);
        }
    }
}
