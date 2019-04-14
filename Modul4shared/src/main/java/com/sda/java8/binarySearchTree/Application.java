package com.sda.java8.binarySearchTree;

public class Application {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.add(40);
        bst.add(50);
        bst.add(30);
        bst.add(20);
        bst.add(35);
        bst.add(32);
        bst.add(1);

        bst.print();

    }

}