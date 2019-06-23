package com.sda;

import java.util.Random;

class Board {
    private int size = 4;
    private Piece[][] matrix = new Piece[size][size];
    private Player player = new Player();

    Board() {
        ESymbols[] symbolArray = ESymbols.values();

        for (int i = 0; i < symbolArray.length; i++) {
            for (int j = 0; j < 2; j++) {
                Random random = new Random();

                int k = random.nextInt(4);
                int l = random.nextInt(4);
                if (matrix[k][l] == null) {
                    matrix[k][l] = new Piece(symbolArray[i]);
                } else {
                    j--;
                }
            }
        }
    }


    String toStrings() {
        StringBuilder x = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j].hide){
                    x.append("0");}
                else {
                    x.append(matrix[i][j].symbol);
                }
            }
            x.append('\n');
        }
        return x.toString();
    }
}
