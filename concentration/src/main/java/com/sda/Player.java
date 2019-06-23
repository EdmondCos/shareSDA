package com.sda;

import java.util.Scanner;

class Player {
    private Scanner scanner = new Scanner(System.in);

    int[] getCoordonates() {
        System.out.print("Select row 1-4: ");
        int row = scanner.nextByte() - 1;
        System.out.print("Select column 1-4: ");
        int column = scanner.nextByte() - 1;
        return new int[]{row, column};
    }
}
