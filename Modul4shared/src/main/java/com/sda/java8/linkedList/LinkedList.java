package com.sda.java8.linkedList;

public class LinkedList {
    private Node head;

    void add(Node node) { //20 / 40 / 50
        if (head == null) {
            head = node;
            return;
        }
        Node parcurge = head; //0 / 20 / 20
        while (parcurge.getNextElement() != null) {
            parcurge = parcurge.getNextElement(); //0 / 20 / 40
        }
        parcurge.setNextElement(node); //0 / 40 / 50 /
    }

    String print() {
        StringBuilder builder = new StringBuilder();
        for (Node nodCurent = head; nodCurent != null; nodCurent = nodCurent.getNextElement()) {
            builder.append(nodCurent.getValue());
            builder.append(" ");
        }
        return builder.toString();
    }

    void remove(int value) { //40
        //if list is empty we stop
        if (head == null) {
            return;
        }
        //if 1st element is the value we anto to remove, head becomes the next element
        if (head.getValue() == value) {
            head = head.getNextElement();
            return;
        }
        //walk the list until we find the value or the list is finished
        Node nodCurent = head;
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
//        if (head.getRight().getRight() == null) {
//            head.setRight(null);
//        }
    }
}
