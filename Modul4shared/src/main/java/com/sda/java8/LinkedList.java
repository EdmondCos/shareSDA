package com.sda.java8;

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
        for (Node nodCurent = head; nodCurent != null; nodCurent = nodCurent.getNextElement()){
            builder.append(nodCurent.getValue());
            builder.append(" ");
        }
            return builder.toString();
    }
}
