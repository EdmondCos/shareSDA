package HW5;

public class HW5 {
    public static void main(String[] args) {
        Liste lista = new Liste();
        BST tree = new BST();



        tree.add(40);
        tree.add(50);
        tree.add(30);
        tree.add(20);
        tree.add(35);
        tree.add(32);
        tree.add(40);

        tree.print();

//        sortNames(lista);
//        newPhone(lista);

//        Starters starters = new Starters();
//        starters.array();
//        starters.adult();
//        starters.pom();

    }

    private static void sortNames(Liste lista) {
        lista.save("Albert", "Einstein");
        lista.save("Stephen", "Hawking");
        lista.save("Isaac", "Newton");
        lista.save("Charles", "Darwin");
        lista.save("Nikola", "Tesla");

        lista.display();
        System.out.println();
        lista.search("Albert", "Einstein");
        System.out.println();
        lista.toArray();
        System.out.println();
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

