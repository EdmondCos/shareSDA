package com.sda.java8.Sort;

public class Bubble {
    public static void bubbleSort(int[] array) {
        //2,4,3

//        for (int i = 0; i < array.length; i++) {
//            for (int j = i; j < array.length; j++)
//                if (array[i] > array[j]) {
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//        }

        boolean bol;
        do {
            bol = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    bol = true;
                }
            }

        } while (bol);
    }

    public static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}