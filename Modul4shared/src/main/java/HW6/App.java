package HW6;

import com.sda.java8.Sort.*;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        gradesSort grades = new gradesSort();

//        operationCount(random);
//        grades.nota(5, 15);
    }

    private static void operationCount(Random random) {
        int[] x = new int[100];
        for (int i = 0; i < x.length; i++) {
            int rdm = random.nextInt(1000);
            x[i] = rdm;
        }
        for (int i: x)
            System.out.print(i + " ");
        System.out.println();

        int[] a = new int[100];
        for (int i = 0 ; i<a.length; i++)
            a[i]=x[i];

        int[] b = new int[100];
        for (int i = 0 ; i<a.length; i++)
            b[i]=x[i];

        int[] c = new int[100];
        for (int i = 0 ; i<a.length; i++)
            c[i]=x[i];

        Bubble.bubbleSort(x);
        insertionSort.insertSort(b);
        mergeSort.mergeSorty(c);
        quickSort.quickSort(a);
    }
}
