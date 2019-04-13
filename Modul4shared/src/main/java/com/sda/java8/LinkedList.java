package com.sda.java8;

public class LinkedList {
    private Node head;

    //Adds new node to the list
    void add(Node node){
        if (head == null){
            head = node;
            return;
        }
        Node parcurge = head;//20
        while(parcurge.getNextElement() != null){
            parcurge = parcurge.getNextElement();
        }
        parcurge.setNextElement(node);

        //Example
        //parcurge = 20|null
        //node = 40|null
        //connect node 20|node 40

        // test if null then ..
        //else: set next element of head
        //parcurge = head
        //while parcurge has a next element
        //      parcurge becomes parvurge.next
        // parcurge.next = node

    }
    //Displays all element values of the list separated by space
    String print(){
        StringBuilder builder = new StringBuilder();
        for (Node nodCurent = head; nodCurent != null; nodCurent = nodCurent.getNextElement()){
            builder.append(nodCurent.getValue());
            builder.append(" ");
        }
        return builder.toString();
    }

}
