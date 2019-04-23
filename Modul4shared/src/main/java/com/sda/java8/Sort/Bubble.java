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

        int counterBubble = 0;
        boolean bol;
        do {
            bol = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    counterBubble++;
                    array[i] = array[i + 1];
                    counterBubble ++;
                    array[i + 1] = temp;
                    counterBubble++;
                    bol = true;
                }
            }

        } while (bol);
        System.out.println("Counter for bubble: " + counterBubble);
    }

    public static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}