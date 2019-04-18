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

    Persons p;
    Persons r;

    void swap(int min, int max) { // 1,3
        om = head;
        for (int i = 1; i <= min; i++) {
            om = om.getNextPosition();
        }
        p = om;
        om = head;
        for (int i = 1; i <= max; i++) {
            om = om.getNextPosition();
        }
        r = om;
        System.out.println(r.getFirstName());

        om = head;
        for (int i = 0; i<=max+1; i++){
            om = om.getNextPosition();
        }
        p.setNextPosition(om);

        om = head;
        for (int i = 0; i < max; i++){
            om = om.getNextPosition();
        }
        om.setNextPosition(p);

        om = head;
        for (int i = 0; i <= min+1; i++){
            om = om.getNextPosition();
        }
        r.setNextPosition(om);

        om = head;
        for (int i = 0; i < min; i++){
            om = om.getNextPosition();
        }
        om.setNextPosition(r);
    }

    //Print the saved names
    void display() {
        om = head;
        for (om = head; om != null; om = om.getNextPosition()) {
            System.out.println(om.getFirstName() + " " + om.getLastName());
        }
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
