package com.sda;

public class Main {
    public static void main(String[] args) {

        Player player = new Player();

        Arbitru arbitru = new Arbitru(4, player);
        arbitru.playGame();
    }
}
