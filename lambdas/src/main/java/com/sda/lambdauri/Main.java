package com.sda.lambdauri;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Person gigel = new Person("Gigel", 18);
        Person dorel = new Person("Dorel", 15);
        Person ionel = new Person("Ionel", 22);

        List<Person> people = new LinkedList<>();
        people.add(gigel);
        people.add(dorel);
        people.add(ionel);

        Predicate<Person> isMajor = person -> person.getAge() >= 18;
//        isMajorLambda(people, isMajor);

//        Adult test este inlocuit de lambda(->) de mai sus
//        adultPersonTest(people);

        ICalculator calculator = (x, y) -> x + y;
        System.out.println(calculator.add(1, 2));


        ISalut hello = () -> {
            String mesaj = "Salut!";
            System.out.println(mesaj);
        };
        ISalut hello2 = () -> System.out.println("Neața lume!");

        hello.greet();
        hello2.greet();

    }

    private static void isMajorLambda(List<Person> people, Predicate<Person> isMajor) {
        for (Person i : people) {
            boolean result = isMajor.test(i);

            if (result) {
                System.out.println(i.getName() + " e major");
            } else {
                System.out.println(i.getName() + " nu e major");
            }
        }
    }

    private static void adultPersonTest(List<Person> people) {
        AdultPersonTest personTest = new AdultPersonTest();
        for (Person i : people) {
            boolean result = personTest.test(i);

            if (result) {
                System.out.println(i.getName() + " e major");
            } else {
                System.out.println(i.getName() + " nu e major");
            }
        }
    }
}
