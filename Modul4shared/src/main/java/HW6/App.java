package HW6;

import com.sda.java8.Sort.*;

import java.time.LocalDate;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        gradesSort grades = new gradesSort();

        LinkedList x = new LinkedList();
        x.add(1);
        x.add(9);
        x.add(6);
        x.add(4);
        x.add(2);
        x.add(3);

        x.set(0, x.get(2));
//        System.out.println(x);

//        mergeLinkedList.mergeSorty(x);

//        Persons pers1 = new Persons("Denise", "Oanta", LocalDate.of(1986, 2, 19));
//        Persons pers2 = new Persons("Cristina", "Trifu", LocalDate.of(1989, 9, 5));
//        Persons pers3 = new Persons("Edmond", "Dabija", LocalDate.of(1994, 9, 5));
//        Persons pers4 = new Persons("Andreea", "Grecu", LocalDate.of(1987, 4, 1));
//        Persons pers5 = new Persons("Gabriela", "Tomas", LocalDate.of(1989, 9, 9));
//        Persons pers6 = new Persons("Mihaela", "Bita", LocalDate.of(1979, 7, 7));
//        Persons pers7 = new Persons("Fabio", "Galamba", LocalDate.of(1985, 5, 2));
//        Persons pers8 = new Persons("Diana", "Nita", LocalDate.of(1993, 9, 7));
//        Persons pers9 = new Persons("Andreea", "Dan", LocalDate.of(1989, 11, 12));
//        Persons[] people = {pers1, pers2, pers3, pers4, pers5, pers6, pers7, pers8, pers9};
//        sortLastName(people);
//        sortBirthday(people);

//        searchCounter(random);
//        operationCount(random);
//        grades.nota(5, 15);
    }

    private static void sortBirthday(Persons[] people) {
        Persons.sort(people);

        for (Persons i : people) {
            System.out.println(i.toStrings());
        }
    }

    private static void sortLastName(Persons[] people) {
        boolean bol;
        do {
            bol = false;
            for (int i = 0; i < people.length - 1; i++) {
                if (people[i].getLastName().compareTo(people[i + 1].getLastName()) > 0) {
                    Persons temp = people[i];
                    people[i] = people[i + 1];
                    people[i + 1] = temp;
                    bol = true;
                } else if (people[i].getLastName().equals(people[i + 1].getLastName())) {
                    if (people[i].getFirstName().compareTo(people[i + 1].getFirstName()) > 0) {
                        Persons temp = people[i];
                        people[i] = people[i + 1];
                        people[i + 1] = temp;
                        bol = true;
                    }
                }
            }
        } while (bol);
    }

    private static void searchCounter(Random random) {
        int size = 10;
        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            int ran = random.nextInt(100) + 1;
            list[i] = ran;
        }
        Arrays.sort(list);

        search.search(list);
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
