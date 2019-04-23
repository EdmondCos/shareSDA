package com.sda.java8.Sort;

public class mergeSort {
    public static int counterMerge = 0;

    public static void mergeSorty(int[] array) {
        mergeRecursiv(array, 0, array.length - 1);
        System.out.println("Counter for merge: " + counterMerge);
    }

    public static void merge(int[] array, int start, int middle, int end) {

        int LL = middle - start + 1;
        int RL = end - middle;
        int[] left = new int[LL];
        int[] right = new int[RL];

        for (int i = 0; i < left.length; i++) {
            left[i] = array[start + i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = array[middle + j + 1];
        }

        int i = 0;
        int j = 0;

        for (int k = start; k < end; k++) {
            if (left[i] <= right[j]) {
                array[k] = left[i++];
                counterMerge++;
                if (i == LL) {
                    while (++k <= end) {
                        array[k] = right[j++];
                        counterMerge++;
                    }
                }
            } else {
                array[k] = right[j++];
                if (j == RL) {
                    while (++k <= end) {
                        array[k] = left[i++];
                        counterMerge++;
                    }
                }
            }
        }
    }

    public static void mergeRecursiv(int[] array, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            mergeRecursiv(array, start, middle);
            mergeRecursiv(array, middle + 1, end);
            merge(array, start, middle, end);
        }
    }

    public static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
