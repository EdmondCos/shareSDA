package com.sda.java8.linkedList;

public class Application {
    public static void main(String[] args) {

        doubleLinkedNode();
        linkedListOneWayRemove();
    }

    private static void doubleLinkedNode() {
        DoubleLinkedNode nod1 = new DoubleLinkedNode(20);
        DoubleLinkedNode nod2 = new DoubleLinkedNode(40);
        DoubleLinkedNode nod3 = new DoubleLinkedNode(50);
        DoubleLinkedNode nod4 = new DoubleLinkedNode(30);
        DoubleLinkedList list = new DoubleLinkedList();

        list.add(nod1);
        list.add(nod2);
        list.add(nod3);
        list.add(nod4);
        System.out.println(list.print());
        System.out.println(list.printReverse());
        System.out.println();
        list.remove(50);
        list.remove(40);
        list.remove(30);
        list.remove(20);
        System.out.println("x: " + list.printReverse());
        list.add(new DoubleLinkedNode(40));
        System.out.println(list.printReverse());
    }
    private static void linkedListOneWayRemove() {
        Node node1 = new Node(20);
        Node node2 = new Node(40);
        Node node3 = new Node(50);
        Node node4 = new Node(30);
        LinkedList list = new LinkedList();

        list.add(node1);
        list.add(node2);
        list.add(node3);
        list.add(node4);
        System.out.println(list.print());
        list.remove(20);
        list.remove(30);
        list.remove(50);
        list.remove(40);
        list.remove(70);
        System.out.println("Elements left: " + list.print());
    }
}
