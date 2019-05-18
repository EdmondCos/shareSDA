package com.sda.colectii;

import javafx.print.Collation;

import java.util.*;

public class Lists {

    static List<String> stringList = new LinkedList<>();
    static Set<String> stringSet = new HashSet<>();

    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "c";
        String d = "b";

        stringList.add(a);
        stringList.add(b);
        stringList.add(c);
        stringList.add(d);
        System.out.println(stringList);

        stringSet.add(a);
        stringSet.add(b);
        stringSet.add(c);
        stringSet.add(d);
//        System.out.println(stringSet);

        System.out.println(stringList.get(2));
        stringList.remove("a");
        stringList.remove(2);
        System.out.println(stringList);
        System.out.println(stringSet.contains(a));

        printCollection(stringSet);
    }

    private static void printCollection(Collection<String> strings) {
        for (String s : strings) {
            System.out.print(s + " ");
        }

        System.out.println();

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }

}
