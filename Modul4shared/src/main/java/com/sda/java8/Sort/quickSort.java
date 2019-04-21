package com.sda.java8.Sort;

public class quickSort {

    public static void quickSort(int[] array){
        sort(array, 0, array.length-1);
    }

    public static void sort(int[] array, int start, int end) {
        if (start < end) {
            int indexPivot = partition(array, start, end);
            sort(array, start, indexPivot - 1);
            sort(array, indexPivot + 1, end);
        }
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1; //index valori < pivot
        for (int parcurge = start; parcurge < end; parcurge++) {
            if (array[parcurge] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[parcurge];
                array[parcurge] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = temp;
        return i + 1;
    }

    public static void printQuick(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
