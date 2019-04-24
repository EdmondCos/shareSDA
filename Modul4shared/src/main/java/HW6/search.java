package HW6;

import java.util.Scanner;

public class search {
    static Scanner scanner = new Scanner(System.in);
    static int counter = 0;

    public static void search(int[] array) {
        System.out.print("Type a number: ");
        int x = scanner.nextInt();
        recursiv(array, 0, array.length, x);
    }

    public static void recursiv(int[] array, int start, int end, int x) {
        if (end == 1 && array[0] == x) {
            counter++;
            System.out.println(x + " was found after " + counter + " checks");

        } else if (x < array[(end / 2) - 1]) {
            counter++;
            end = end / 2;
            int[] z = new int[end];
            for (int i = 0; i < end; i++) {
                z[i] = array[i];
            }
            recursiv(z, start, end, x);
        } else {
            counter++;
            if (end % 2 == 0) {
                start = end / 2;
            } else {
                start = end / 2 + 1;
            }
            int startHolder = end/2;
            int[] w = new int[start];
            for (int i = 0; i < start; i++) {
                w[i] = array[startHolder];
                startHolder++;
            }
            end = w.length;
            recursiv(w, start, end, x);
        }
    }
}
