package com.sda.java8.binarySearchTree;

public class TreeNode {
    private final int key;
    private TreeNode right;
    private TreeNode left;
    private TreeNode parent;

    public TreeNode(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public TreeNode getRight() {
        return right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public  TreeNode getParent() {
        return parent;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }
}
