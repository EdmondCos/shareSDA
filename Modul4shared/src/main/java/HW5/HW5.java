package HW5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Liste lista = new Liste();

        lista.store("Albert", "Einstein");
        lista.store("Stephen", "Hawking");
        lista.store("Isaac", "Newton");
        lista.store("Charles", "Darwin");
        lista.store("Nikola", "Tesla");

        lista.display();
        System.out.println();
        lista.search("Albert", "Einstein");
        System.out.println();


//        newPhone(lista);

//        Starters starters = new Starters();
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

