package HW6;

import java.util.LinkedList;

//Work in progress

public class mergeLinkedList {
    public static int counterMerge = 0;

    public static void mergeSorty(LinkedList array) {
        mergeRecursiv(array, 0, array.size() - 1);
        System.out.println("Counter for merge: " + counterMerge);
    }

    public static void merge(LinkedList array, int start, int middle, int end) {

        int LL = middle - start + 1;
        int RL = end - middle;
        LinkedList left = new LinkedList();
        LinkedList right = new LinkedList();

        for (int i = 0; i < left.size(); i++) {
            left.set(i, array.get(start + i));
        }
        for (int j = 0; j < right.size(); j++) {
            right.set(j, array.get(middle + j + 1));
        }

        int i = 0;
        int j = 0;

        for (int k = start; k < end; k++) {
            if ((int) left.get(i) <= (int) right.get(j)) {
                array.set(k, left.get(i++));
                counterMerge++;
                if (i == LL) {
                    while (++k <= end) {
                        array.set(k, right.get(j++));
                        counterMerge++;
                    }
                }
            } else {
                array.set(k, right.get(j++));
                if (j == RL) {
                    while (++k <= end) {
                        array.set(k, left.get(i++));
                        counterMerge++;
                    }
                }
            }
        }
    }

    public static void mergeRecursiv(LinkedList array, int start, int end) {
        if (start < end && array.size() != 0) {
            int middle = (start + end) / 2;
            mergeRecursiv(array, start, middle);
            mergeRecursiv(array, middle + 1, end);
            merge(array, start, middle, end);
        }
    }

}

