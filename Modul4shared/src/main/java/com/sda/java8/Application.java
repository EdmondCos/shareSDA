package com.sda.java8;

public class Application {
    public static void main(String[] args) {
        Node node1 = new Node(20);
        Node node2 = new Node(40);
        Node node3 = new Node(50);

        LinkedList list = new LinkedList();
        list.add(node1);
        list.add(node2);
        list.add(node3);
        System.out.println(list.print());
    }

}
