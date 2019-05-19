package com.sda.comunicare;

public class T2 implements Runnable {

    Chat chat;
    String[] answers = {"Hello", "I am good, what about you?", "Great"};

    public T2(Chat chat) {
        this.chat = chat;
        new Thread(this, "Answer Thread").start();
    }

    @Override
    public void run() {
        for (String temp : answers) {
            chat.answer(temp);
        }
    }
}
