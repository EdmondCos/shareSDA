package Salary;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class salaryCalculator {
    public static void main(String[] args) {

//        stuff();
    }

    private static void stuff() {
        Scanner scanner = new Scanner(System.in);
        boolean bol = true;

        while (bol) {
            System.out.println("Alege salariul: Net / Brut");
            String x = scanner.nextLine();
            String y = x.toLowerCase();

            if (y.equals("net")) {
                bol = false;
                System.out.print("Salariu net: ");
                int net = scanner.nextInt();
                int brut = (int) (net / 0.585);
                System.out.println("Salariul brut: " + brut);


            } else if (y.equals("brut")) {
                bol = false;
                System.out.print("Salariu brut: ");
                int brut = scanner.nextInt();

                System.out.println("Contibutii Angajat");
                //25% din brut pensii - 21.25% P1 / 3.75% P2
                int pilonUnu = (int) (brut * 0.2125);
                int pilonDoi = (int) (brut * 0.0375);
                double pensie = (brut * 0.25);
                System.out.println("Pensie (CAS): " + pensie);
                System.out.println("Pilon 1: " + pilonUnu);
                System.out.println("Pilon 2: " + pilonDoi);

                //10% din brut sanatate
                int CASS = (int) (brut * 0.1);
                System.out.println("Sanatate (CASS): " + CASS);

                //10% impozit din brut dupa scaderea contributiilor
                int impozit = (int) ((brut - pilonDoi - pilonUnu - CASS) * 0.1);
                System.out.println("Impozit pe Venit: " + impozit);

                //salariu net
                int net = (int) (brut - pensie - CASS - impozit);
                System.out.println("Salariu net: " + net);
            }
        }
    }
}
