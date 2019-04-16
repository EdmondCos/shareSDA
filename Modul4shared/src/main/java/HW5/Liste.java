package HW5;

import com.sda.java8.Node;

import java.util.LinkedList;

public class Liste {
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
    void printreverse(){
        LinkedList reverse = new LinkedList();
        for(int i = price.size()-1; i>=0; i-- ){
            reverse.add(price.get(i));
        }
        System.out.println(reverse);
    }
}
