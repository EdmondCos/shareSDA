package com.sda.java8;

public class DoubleLinkedList {
    private DoubleLinkedNode head;
    private DoubleLinkedNode tail;

    void add(DoubleLinkedNode node) { //20 40 50
        if (head == null) {
            head = node; // 0 20
            tail = node; // 0 20
            return;
        }
        tail.setNextElement(node); // n/a 20.setEl(40) 40.setEl(50)
        node.setPreviousElement(tail); // n/a 40.setPr(20) 50.setPr(40)
        tail = node; // n/a 20->40 40->50
    }

    String print() {
        StringBuilder builder = new StringBuilder();
        for (DoubleLinkedNode nodCurent = head; nodCurent != null; nodCurent = nodCurent.getNextElement()) {
            builder.append(nodCurent.getValue());
            builder.append(" ");
        }
        return builder.toString();
    }

    String printReverse() {
        StringBuilder reverse = new StringBuilder();
        for (DoubleLinkedNode ultimulNod = tail; ultimulNod != null; ultimulNod = ultimulNod.getPreviousElement()) {
            reverse.append(ultimulNod.getValue());
            reverse.append(" ");
        }
        return reverse.toString();
    }

    void remove(int value) { //40
        //if list is empty we stop
        if (tail == null) {
            return;
        }
        //if 1st element is the value we anto to remove, head becomes the next element
        if (head.getValue() == value) {
            head = head.getNextElement();
            return;
        }
        //walk the list until we find the value or the list is finished
        DoubleLinkedNode nodCurent = head;
        while (nodCurent.getNextElement() != null && nodCurent.getNextElement().getValue() != value) {
            nodCurent = nodCurent.getNextElement();
        }
        //if we dod not find the lelment, end
        if (nodCurent.getNextElement() == null) {
            return;
        }
        //remove the element
        nodCurent.setNextElement(nodCurent.getNextElement().getNextElement());

//        REMOVE IF LIST HAS 2 ELEMENTS
//        if (head.getNextElement().getNextElement() == null) {
//            head.setNextElement(null);
//        }
    }
}
