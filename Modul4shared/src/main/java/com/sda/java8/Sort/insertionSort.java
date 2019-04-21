package com.sda.java8.Sort;

public class insertionSort {
    public static void insertSort(int[] array) {
        //6, 5, 3, 1, 8, 7, 2, 4
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }

    public static void printInsert(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
