package HW5;

public class TreeNode {
    int val;
    TreeNode parent;
    TreeNode left;
    TreeNode right;

    public TreeNode(int key) {
        this.val = key;
    }

    public int getVal() {
        return val;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode getRight() {
        return right;
    }

}
