package HW6;

import java.util.Random;

public class gradesSort {
    Random random = new Random();

    public int[] sortGrades() {
        boolean bol;
        int[] grades = new int[25];
        for (int i = 0; i < grades.length; i++) {
            int rdm = random.nextInt(51) + 49;  //sfantu 5
            grades[i] = rdm;
        }

        do {
            bol = false;
            for (int i = 0; i < grades.length - 1; i++) {
                if (grades[i] > grades[i + 1]) {
                    int store = grades[i];
                    grades[i] = grades[i + 1];
                    grades[i + 1] = store;
                    bol = true;
                }
            }
        }
        while (bol);

        for (int i : grades)
            System.out.print(i + " ");
        System.out.println();

        return grades;
    }
    public void nota(int nota1, int nota2) {
        int[] note = sortGrades();

        System.out.print(note[nota1 - 1] + " ");
        System.out.print(note[nota2 - 1] + " ");
    }
}
