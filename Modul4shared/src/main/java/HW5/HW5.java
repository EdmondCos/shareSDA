package HW5;

import java.util.LinkedList;
import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Starters starters = new Starters();
        Liste lista = new Liste();


//        newPhone(lista);

//        starters.array();
//        starters.adult();
//        starters.pom();

    }

    private static void newPhone(Liste lista) {
        lista.add(500);
        lista.add(240);
        lista.add(300);
        lista.add(800);
        lista.add(1600);
        lista.print();
        lista.printreverse();
    }
}

