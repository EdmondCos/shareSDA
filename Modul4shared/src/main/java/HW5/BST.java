package HW5;

public class BST {
    private TreeNode root;
    int i = 0;

    void add(int value) {

        TreeNode node = new TreeNode(value);
        if (root == null) {
            root = node;
            return;
        }

        TreeNode position = root;

        while (true) {
            if (value == position.getVal()){
                return;
            }
            if (value < position.getVal()) {
                if (position.getLeft() != null) {
                    position = position.getLeft();
                    continue;
                }
                else {
                    position.setLeft(node);
                    node.setParent(position);
                    return;
                }

            }
            if (value > position.getVal()) {
                if (position.getRight() != null) {
                    position = position.getRight();
                    continue;
                }
                else {
                    position.setRight(node);
                    node.setParent(position);
                    return;
                }
            }
        }
    }

    public void print() {
        printRecursiv(root);
        System.out.println();
    }

    public void printRecursiv(TreeNode nodez) {
        if (nodez != null) {
            printRecursiv(nodez.getLeft());
            System.out.print(nodez.getVal() + " ");
            printRecursiv(nodez.getRight());
        }
    }
}

