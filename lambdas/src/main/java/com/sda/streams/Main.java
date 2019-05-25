package com.sda.streams;

import com.sda.lambdauri.Person;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        List<Person> people = com.sda.lambdauri.Main.getPeople();
        String[] array = {"1", "2"};

//        operatie initiala
        Stream<Person> stream = people.stream();
        Stream<String> streamDeArray = Stream.of(array);
//        opertii de incheiere
        List<String> strings = streamDeArray.collect(toList());

//        operatii intermediare
//        Vreau sa afisez doar varstele sub 18 ani
        for (Person i : people) {
            if (i.getAge() < 18) {
                System.out.println(i.getName());
            }
        }

        List<Integer> collect = people.stream().
//              map intoarce dp person , valoare din getAge
        map(person -> person.getAge()).
//              filter trimite mai departe doar filtrarile care respecta conditia (age <18)
        filter(age -> age < 18).
//              peek permite operatiuni de acces la date. ex sout
        peek(age -> System.out.println(age)).
//              collect intoarce valorile din tream(care au trecut de filtru), intr-o colectie noua(lista
        collect(toList());

        Predicate<Integer> isMinor = age -> age < 18;
        List<Integer> collect1 = people.stream().
                map(Person::getAge).
                filter(isMinor).
                peek(System.out::println).
                collect(toList());
    }
}
