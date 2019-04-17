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

    //Display the saved names
    void display() {
        om = head;
        for (int i = 0; i < counter; i++) {
            System.out.println(om.getFirstName() + " " + om.getLastName());
            om = om.getNextPosition();
            if (om == null) {
                break;
            }
        }
        System.out.println("Size: " + counter);
    }

    //Search if a given name is in the list
    void search(String first, String last) {
        Persons search = new Persons(first, last);
        om = head;
        for (int i = 0; i < counter; i++) {
            if (om.getFirstName().equals(search.getFirstName())) {
                if (om.getLastName().equals(search.getLastName())) {
                    System.out.println(first + " " + last + " was present");
                    return;
                }
            }
            om = om.getNextPosition();
        }
        System.out.println(first + " " + last + " was not present");
    }

    //Turn the list into an array
    void toArray() {
        Persons[] array = new Persons[counter];
        int i = 0;
        for (om = head; om != null; om = om.getNextPosition()){
            if (i == counter){
                return;
            }
            array[i] = om;
            i++;
        }
        for (Persons x : array)
        System.out.print(x.getFirstName() + " " + x.getLastName() + "; ");
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
