package com.sda.java8.binarySearchTree;

public class BinarySearchTree {
    private TreeNode root;

    public void add(int key) {
        TreeNode newNode = new TreeNode(key);

        if (root == null) {
            root = newNode;
            return;
        }

        TreeNode currentNode = root;

        while (true) {

            if (currentNode.getKey() < key) {
                if (currentNode.getRight() != null){
                    currentNode = currentNode.getRight();
                    continue; // jumps to next iteration of while, without running what is under it
                }
                currentNode.setRight(newNode);
                newNode.setParent(currentNode);
                return;
            }
            else if (currentNode.getKey() > key) {
                if(currentNode.getLeft() != null){
                    currentNode = currentNode.getLeft();
                    continue;
                }
                currentNode.setLeft(newNode);
                newNode.setParent(currentNode);
                return;
            }
        }

    }

    void print(){
        printRecursiv(root);
        System.out.println();
    }

    void printRecursiv(TreeNode node) {
        if (node != null){
            printRecursiv(node.getLeft());
            System.out.print(node.getKey() + " ");
            printRecursiv(node.getRight());
        }

    }
}
