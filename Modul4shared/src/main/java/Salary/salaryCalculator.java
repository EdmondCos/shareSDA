package Salary;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class salaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = 2100;
        double y = 0.25;
        double z = 2;
        double a = x/21;
        x = x- (a*z*y);
        System.out.println(x);

//        stuff();
    }

    private static double getDeductibil(double brutTotal) {
        double deductibil = 0;
        if (brutTotal >= 1 && brutTotal <= 1950) {
            deductibil = 510;
        } else if (brutTotal >= 1951 && brutTotal <= 2000) {
            deductibil = 495;
        } else if (brutTotal >= 2001 && brutTotal <= 2050) {
            deductibil = 480;
        } else if (brutTotal >= 2051 && brutTotal <= 2100) {
            deductibil = 465;
        } else if (brutTotal >= 2101 && brutTotal <= 2150) {
            deductibil = 450;
        } else if (brutTotal >= 2151 && brutTotal <= 2200) {
            deductibil = 435;
        } else if (brutTotal >= 2201 && brutTotal <= 2250) {
            deductibil = 420;
        } else if (brutTotal >= 2251 && brutTotal <= 2300) {
            deductibil = 405;
        } else if (brutTotal >= 2301 && brutTotal <= 2350) {
            deductibil = 390;
        } else if (brutTotal >= 2351 && brutTotal <= 2400) {
            deductibil = 375;
        } else if (brutTotal >= 2401 && brutTotal <= 2450) {
            deductibil = 360;
        } else if (brutTotal >= 2451 && brutTotal <= 2500) {
            deductibil = 345;
        } else if (brutTotal >= 2501 && brutTotal <= 2550) {
            deductibil = 330;
        } else if (brutTotal >= 2551 && brutTotal <= 2600) {
            deductibil = 315;
        } else if (brutTotal >= 2601 && brutTotal <= 2650) {
            deductibil = 300;
        } else if (brutTotal >= 2651 && brutTotal <= 2700) {
            deductibil = 285;
        } else if (brutTotal >= 2701 && brutTotal <= 2750) {
            deductibil = 270;
        } else if (brutTotal >= 2751 && brutTotal <= 2800) {
            deductibil = 255;
        } else if (brutTotal >= 2801 && brutTotal <= 2850) {
            deductibil = 240;
        } else if (brutTotal >= 2851 && brutTotal <= 2900) {
            deductibil = 225;
        } else if (brutTotal >= 2901 && brutTotal <= 2950) {
            deductibil = 210;
        } else if (brutTotal >= 2951 && brutTotal <= 3000) {
            deductibil = 195;
        } else if (brutTotal >= 3001 && brutTotal <= 3050) {
            deductibil = 180;
        } else if (brutTotal >= 3051 && brutTotal <= 3100) {
            deductibil = 165;
        } else if (brutTotal >= 3101 && brutTotal <= 3150) {
            deductibil = 150;
        } else if (brutTotal >= 3151 && brutTotal <= 3200) {
            deductibil = 135;
        } else if (brutTotal >= 3201 && brutTotal <= 3250) {
            deductibil = 120;
        } else if (brutTotal >= 3251 && brutTotal <= 3300) {
            deductibil = 105;
        } else if (brutTotal >= 3301 && brutTotal <= 3350) {
            deductibil = 90;
        } else if (brutTotal >= 3351 && brutTotal <= 3400) {
            deductibil = 75;
        } else if (brutTotal >= 3401 && brutTotal <= 3450) {
            deductibil = 60;
        } else if (brutTotal >= 3451 && brutTotal <= 3500) {
            deductibil = 45;
        } else if (brutTotal >= 3501 && brutTotal <= 3550) {
            deductibil = 30;
        } else if (brutTotal >= 3551 && brutTotal <= 3600) {
            deductibil = 15;
        }
        return deductibil;
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
