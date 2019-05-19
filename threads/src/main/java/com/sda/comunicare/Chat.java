package com.sda.comunicare;

public class Chat {

    //    Verifica daca avem deschis canalul de cominicare
    boolean isActionUnavailable = false;

    synchronized void question(String question) {
        if (isActionUnavailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(question);
        isActionUnavailable = true;
        notify();
    }

    synchronized void answer(String answer) {
        if (!isActionUnavailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(answer);
        isActionUnavailable = false;
        notify();
    }
}
