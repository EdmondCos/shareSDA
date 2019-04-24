package HW6;

import com.sda.java8.Sort.*;

import java.time.LocalDate;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        gradesSort grades = new gradesSort();

        int size = 10;
        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            int ran = random.nextInt(100) + 1;
            list[i] = ran;
        }
        Arrays.sort(list);
        for ( int i : list){
            System.out.print(i + " ");
        }
        System.out.println();

        search.search(list);

//        Persons pers = new Persons();
//        pers.pers("Denise", "Oanta", LocalDate.of(1986, 2, 19));
//        pers.pers("Cristina", "Trifu", LocalDate.of(1989, 9, 5));
//        pers.pers("Edmond", "Dabija", LocalDate.of(1994, 9, 5));
//        pers.pers("Andreea", "Grecu", LocalDate.of(1987, 4, 1));
//        pers.pers("Gabriela", "Tomas", LocalDate.of(1989, 9, 9));
//        pers.pers("Mihaela", "Bita", LocalDate.of(1979, 7, 7));
//        pers.pers("Fabio", "Galamba", LocalDate.of(1985, 5, 2));
//        pers.pers("Diana", "Nita", LocalDate.of(1993, 9, 7));
//        pers.pers("Andreea", "Dan", LocalDate.of(1989, 11, 12));


//        operationCount(random);
//        grades.nota(5, 15);
    }


    private static void operationCount(Random random) {
        int[] x = new int[100];
        for (int i = 0; i < x.length; i++) {
            int rdm = random.nextInt(1000);
            x[i] = rdm;
        }
        for (int i : x)
            System.out.print(i + " ");
        System.out.println();

        int[] a = new int[100];
        for (int i = 0; i < a.length; i++)
            a[i] = x[i];

        int[] b = new int[100];
        for (int i = 0; i < a.length; i++)
            b[i] = x[i];

        int[] c = new int[100];
        for (int i = 0; i < a.length; i++)
            c[i] = x[i];

        Bubble.bubbleSort(x);
        insertionSort.insertSort(b);
        mergeSort.mergeSorty(c);
        quickSort.quickSort(a);
    }
}
