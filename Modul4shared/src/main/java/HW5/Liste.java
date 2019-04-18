package HW5;

import java.util.LinkedList;

public class Liste {
    final int MAX_SIZE = 3;
    private Persons om;
    private Persons head;
    int counter = 0;

    //Save the names in a List
    public void save(String first, String last) {
//        List max size = 3
//        if (counter >= MAX_SIZE){
//            return;
//        }
        counter++;
        Persons om1 = new Persons(first, last);
        if (om == null) {
            om = om1;
            head = om1;
            return;
        }
        om.setNextPosition(om1);
        om = om1;
    }


    void swap(int min, int max) { // 1,2
        if (min >= counter || max >= counter){
            System.out.println("Error! List has only " + counter + " elements.");
            System.out.println();
            return;
        }
        if (min == max) {
            return;
        }
        if (min == 0) {
            om = head;
            Persons x2 = om;
            Persons x3 = om.getNextPosition();

            om = head;
            for (int i = 1; i < max; i++) {
                om = om.getNextPosition();
            }
            Persons y1 = om;
            Persons y2 = om.getNextPosition();
            Persons y3 = om.getNextPosition().getNextPosition();
            if (max == 1) {
                x2.setNextPosition(y3);
                y2.setNextPosition(x2);
                head = y2;
                return;
            }
            y2.setNextPosition(x3);
            y1.setNextPosition(x2);
            x2.setNextPosition(y3);
            head = y2;
            return;
        }
        if (max == 0) {
            om = head;
            Persons y2 = om;
            Persons y3 = om.getNextPosition();

            om = head;
            for (int i = 1; i < max; i++) {
                om = om.getNextPosition();
            }
            Persons x1 = om;
            Persons x2 = om.getNextPosition();
            Persons x3 = om.getNextPosition().getNextPosition();
            if (min == 1) {
                y2.setNextPosition(x3);
                x2.setNextPosition(y2);
                head = x2;
                return;
            }
            x2.setNextPosition(y3);
            x1.setNextPosition(y2);
            y2.setNextPosition(x3);
            head = x2;
            return;
        }
        else {
            om = head;
            for (int i = 1; i < min; i++) {
                om = om.getNextPosition();
            }
            Persons x1 = om;
            Persons x2 = om.getNextPosition();
            Persons x3 = om.getNextPosition().getNextPosition();

            om = head;
            for (int i = 1; i < max; i++) {
                om = om.getNextPosition();
            }
            Persons y1 = om;
            Persons y2 = om.getNextPosition();
            Persons y3 = om.getNextPosition().getNextPosition();

            if (min + 1 == max) {
                x1.setNextPosition(y2);
                x3.setNextPosition(y1);
                x2.setNextPosition(y3);
                return;
            }
            if (min - 1 == max) {
                y1.setNextPosition(x2);
                y3.setNextPosition(x1);
                y2.setNextPosition(x3);
                return;
            }
            x1.setNextPosition(y2);
            y1.setNextPosition(x2);
            x2.setNextPosition(y3);
            y2.setNextPosition(x3);
        }
    }

    //Print the saved names
    void display() {
        om = head;
        for (om = head; om != null; om = om.getNextPosition()) {
            System.out.println(om.getFirstName() + " " + om.getLastName());
        }
        System.out.println();
        System.out.println("Size: " + counter);
        System.out.println();
    }

    //Search if a given name is in the list
    void search(String first, String last) {
        Persons search = new Persons(first, last);
        om = head;
        for (int i = 0; i < counter; i++) {
            if (om.getFirstName().equals(search.getFirstName())) {
                if (om.getLastName().equals(search.getLastName())) {
                    System.out.println(first + " " + last + " was present");
                    System.out.println();
                    return;
                }
            }
            om = om.getNextPosition();
        }
        System.out.println(first + " " + last + " was not present");
        System.out.println();
    }

    //Turn the list into an array
    void toArray() {
        Persons[] array = new Persons[counter];
        int i = 0;
        for (om = head; om != null; om = om.getNextPosition()) {
            if (i == counter) {
                return;
            }
            array[i] = om;
            i++;
        }
        for (Persons x : array) {
            System.out.print(x.getFirstName() + " " + x.getLastName() + "; ");
            System.out.println();
        }
    }

    // Exercitiu sortare pret
    private ListeNode nod1;
    LinkedList price = new LinkedList();
    String x = new String();

    public void add(int value) {
        ListeNode nod2 = new ListeNode(value);
        int s = 0;
        int i = price.size() - 1;
        boolean b = true;

        if (nod1 == null) {
            nod1 = nod2;
            nod1.setValue(value);
            price.add(nod1.getValue());
            return;
        }

        while (value < nod1.getValue()) {
            s = nod1.getValue();
            price.set(i, value);
            x = String.valueOf(price.get(i));
            int y = Integer.valueOf(x);
            nod1.setValue(y);
            i--;
            b = false;
        }
        if (b == false) {
            price.add(s);
            nod1.setValue(s);
        }
        if (b) {
            nod1.setValue(value);
            price.add(nod1.getValue());
        }
    }

    void print() {
        System.out.println(price);
    }

    void printreverse() {
        LinkedList reverse = new LinkedList();
        for (int i = price.size() - 1; i >= 0; i--) {
            reverse.add(price.get(i));
        }
        System.out.println(reverse);
    }
}
