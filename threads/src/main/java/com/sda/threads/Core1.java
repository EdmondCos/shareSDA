package com.sda.threads;

public class Core1 extends Thread {

    public void run() {
        System.out.println("Thread started from Core1");
//        try {
//            Main.countdown();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        for (int i = 5; i >= 0; i--) {
            System.out.println("Bomba explodeaza in: " + i + " secunde");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
