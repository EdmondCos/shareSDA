package com.sda.java8.Sort;


import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] myArray = {2, 4, 3};
        int[] myArray1 = {6, 5, 3, 1, 8, 7, 2, 4};

        mergeSort merge = new mergeSort();
        merge.mergeSorty(myArray1);
        merge.print(myArray1);

//        bubbleSortMethod(random);

    }

    private static void bubbleSortMethod(Random random) {
        Bubble bubble = new Bubble();

        int[] myArray = {6, 5, 3, 1, 8, 7, 2, 4};
        int size = 100;
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

        bubble.bubbleSort(myArray);
        bubble.print(myArray);
        System.out.println();
        bubble.bubbleSort(randomArray);
        bubble.print(randomArray);
    }
}
