package com.sda.abstractClasses;

public class Main {
    public static void main(String[] args) {
        AnAnimal giraffe = new Giraffe();
        AnAnimal whale = new Whale();

        print(giraffe);
        print(whale);
    }

    private static void print(AnAnimal animal) {
        animal.eat();
        animal.sleep();
    }
}
