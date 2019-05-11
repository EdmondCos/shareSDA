package com.sda.abstractClasses;

public class Whale extends AnAnimal {
    @Override
    public void eat() {
        System.out.println("The whale swallows fish. Ewww!");
    }

    @Override
    public void sleep() {
        System.out.println("The whale sleeps swimming");
    }
}
