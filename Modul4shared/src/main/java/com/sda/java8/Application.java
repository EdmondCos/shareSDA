package com.sda.java8;

public class Application {
    public static void main(String[] args) {
        Node node1 = new Node(20);
        Node node2 = new Node(40);
        Node node3 = new Node(50);
        Node node4 = new Node(30);
        LinkedList x = new LinkedList();

        x.add(node1);
        x.add(node2);
        x.add(node3);
        x.add(node4);
        System.out.println(x.print());
        x.remove(40);
        System.out.println(x.print());
    }
}
