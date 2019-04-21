package com.sda.java8.Sort;


import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] myArray = {2, 4, 3};
        int[] myArray1 = {6, 5, 3, 1, 8, 7, 2, 4};
        int size = 18652;
        int[] randomArray = new int[size];
        for (int i = 0; i < size; i++) {
            int rdm = random.nextInt(size);
            int j = 0;
            while (j < i) {
                if (rdm == randomArray[j]) {
                    j = 0;
                    rdm = random.nextInt(size);
                } else {
                    j++;
                }
            }
            randomArray[i] = rdm;
        }

        String[] x = {"Alexandru", "Edmond", "Gabriel", "Marius", "Catalin", "Diana", "Cosmin", "Razvan", "Mihai", "Iana", "Robert", "Tudor"};

//        bubbleString.bubbleString(x);
//        bubbleString.printString(x);
        quickString.quickString(x);
        quickString.printQuickString(x);

//        quickSort(random1);
//        insertSort(myArray);
//        mergeSort(random2);
//        bubbleSort(reverse);
    }

    private static void quickSort(int[] random2) {
        quickSort quick = new quickSort();
        LocalTime acub = LocalTime.now();

        quick.quickSort(random2);
        quick.printQuick(random2);
        System.out.println();

        LocalTime dupab = LocalTime.now();
        long x = ChronoUnit.MILLIS.between(acub, dupab);
        System.out.println("Time quick:" + x);
        System.out.println();
    }

    private static void insertSort(int[] randomArray) {
        insertionSort insertion = new insertionSort();
        insertion.insertSort(randomArray);
        insertion.printInsert(randomArray);
    }

    private static void mergeSort(int[] randomArray) {
        mergeSort merge = new mergeSort();
        LocalTime acub = LocalTime.now();

        merge.mergeSorty(randomArray);
        merge.print(randomArray);
        System.out.println();

        LocalTime dupab = LocalTime.now();
        long x = ChronoUnit.MILLIS.between(acub, dupab);
        System.out.println("Timp merge:" + x);
        System.out.println();
    }

    private static void bubbleSort(int[] randomArray) {
        Bubble bubble = new Bubble();
        LocalTime acu = LocalTime.now();

        bubble.bubbleSort(randomArray);
        bubble.print(randomArray);
        System.out.println();

        LocalTime dupa = LocalTime.now();
        long x = ChronoUnit.MILLIS.between(acu, dupa);
        System.out.println("Timp bubble:" + x);
    }
}

