package HW5;

public class BST {
    private TreeNode root;

    void add(int value) {
        TreeNode node = new TreeNode(value);
        if (root == null) {
            root = node;
            root.setMin(value);
            root.setMax(value);
            return;
        }

        if (value < root.getMin()) {
            root.setMin(value);
        }
        if (value > root.getMax()) {
            root.setMax(value);
        }

        TreeNode position = root;
        while (true) {
            if (value == position.getVal()) {
                return;
            }
            if (value < position.getVal()) {
                if (position.getLeft() != null) {
                    position = position.getLeft();
                    continue;
                } else {
                    position.setLeft(node);
                    node.setParent(position);
                    return;
                }

            }
            if (value > position.getVal()) {
                if (position.getRight() != null) {
                    position = position.getRight();
                    continue;
                } else {
                    position.setRight(node);
                    node.setParent(position);
                    return;
                }
            }
        }
    }

    public void minMax() {
        System.out.println("Min: " + root.getMin() + ". Max: " + root.getMax() + ".");
    }

    TreeNode t;
    boolean bol = true;

    public void search(int numar) {
        t = new TreeNode(numar);
        searchRecursiv(root);
        if (bol) {
            System.out.println(t.getVal() + " could not be found");
        }
    }

    public void searchRecursiv(TreeNode nodez) { //20
        if (nodez != null) {
            searchRecursiv(nodez.getLeft());
            searchRecursiv(nodez.getRight());
            if (t.getVal() == nodez.getVal()) {
                System.out.println(t.getVal() + " was found");
                bol = false;
                return;
            }
        }
    }

    public void print() {
        printRecursiv(root);
    }

    public void printRecursiv(TreeNode nodez) {
        if (nodez != null) {
            printRecursiv(nodez.getLeft());
            System.out.print(nodez.getVal() + " ");
            printRecursiv(nodez.getRight());

        }
    }
}

