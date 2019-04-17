package HW5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Liste {
    final int MAX_SIZE = 3;
    private Persons om;
    private Persons head;
    int counter = 0;

    public void store(String first, String last) {
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

    void toArray() {

    }


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
