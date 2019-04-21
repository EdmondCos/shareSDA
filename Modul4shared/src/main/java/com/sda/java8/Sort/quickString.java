package com.sda.java8.Sort;

public class quickString {

    public static void quickString(String[] array){
        sort(array, 0, array.length-1);
    }

    public static void sort(String[] array, int start, int end) {
        if (start < end) {
            int indexPivot = partition(array, start, end);
            sort(array, start, indexPivot - 1);
            sort(array, indexPivot + 1, end);
        }
    }

    public static int partition(String[] array, int start, int end) {
        String pivot = array[end];
        int i = start - 1; //index valori < pivot
        for (int parcurge = start; parcurge < end; parcurge++) {
            if (array[parcurge].compareTo(pivot) <= 0) {
                i++;
                String temp = array[i];
                array[i] = array[parcurge];
                array[parcurge] = temp;
            }
        }
        String temp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = temp;
        return i + 1;
    }

    public static void printQuickString(String[] array) {
        for (String i : array) {
            System.out.print(i + " ");
        }
    }
}
