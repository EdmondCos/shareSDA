package HW5;

import java.util.Scanner;

public class Starters {
    Scanner scanner = new Scanner(System.in);

    void adult() {
        System.out.print("Please insert age: ");
        int x = scanner.nextInt();

        if (x >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a minor");
        }
    }

    void pom() {
        int lat = 9;
        int h;
        if (lat % 2 == 0) {
            h = lat / 2;
        } else {
            h = (lat + 1) / 2;
        }
        int l = h;
        int m = h;

        for (int i = 0; i < h; i++) {
            int j = 0;
            while (j < m) {
                System.out.print(" ");
                j++;
            }
            while (j <= l) {
                System.out.print("*");
                j++;
            }
            --m;
            l++;
            System.out.println();
        }
        for (int i = 0; i<h/2; i++){
            int base = 0;
            while (base != h-1){
                System.out.print(" ");
                base++;
            }
            while (base != h+2){
                System.out.print("#");
                base++;
            }
            System.out.println();
        }
    }

    void array() {
        System.out.println("Please type the numbers:");
//        String input = scanner.nextLine();
        String input = "1 1 3 2 1 4 6 12 1 3 2";
        String array[] = input.split(" ");
        //Show numbers one after another
        for (String i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Show numbers reverse
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //Show all odd numbers
        for (String i : array) {
            int x = Integer.valueOf(i);
            if (x % 2 != 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
        //Show numbers divisible by 3
        for (String i : array) {
            int x = Integer.valueOf(i);
            if (x % 3 == 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
        //Show sum4 of 1st 4 numbers
        int sum4 = 0;
        for (int i = 0; i < 4; i++) {
            int x = Integer.valueOf(array[i]);
            sum4 = sum4 + x;
        }
        System.out.println(sum4);
        //Sum of last 5 , bigger than 2
        int sum5 = 0;
        int l = array.length - 5; // 7
        for (int i = array.length - 1; i >= l; i--) {
            int x = Integer.valueOf(array[i]);
            if (x > 2) {
                sum5 = sum5 + x;
            } else {
                l = l - 1;
            }
            if (i == 0) {
                break;
            }
        }
        System.out.println(sum5);
        //Numbers from the beginning that the sum is >10
        int sum10 = 0;
        int counter =0;
        for (String i : array) {
            int x = Integer.valueOf(i);
            sum10 = sum10 + x;
            counter++;
            if (sum10 > 10){
                break;
            }
        }
        System.out.println(counter + " numbers");
    }
}

