package com.sda.java8.Sort;

public class bubbleString {
    public static void bubbleString(String[] array) {
        //Alex, Tudor, Gabi

//        for (int i = 0; i < array.length; i++) {
//            for (int j = i; j < array.length; j++) {
//                if (array[i].compareTo(array[j]) >= -1) {
//                    String temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }

        boolean bol;
        do {
            bol = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    String temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    bol = true;
                }
            }

        } while (bol);
    }

    public static void printString(String[] array) {
        for (String i : array) {
            System.out.print(i + " ");
        }
    }
}