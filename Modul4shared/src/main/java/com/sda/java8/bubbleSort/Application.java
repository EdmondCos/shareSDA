package com.sda.java8.bubbleSort;


import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Bubble bubble = new Bubble();

        int[] myArray = {6, 5, 3, 1, 8, 7, 2, 4};

//        System.out.print("Nr elemente: ");
        int size = 100; //scanner.nextInt();
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


        bubble.bubbleSort(randomArray);
        bubble.print(randomArray);

    }
}
