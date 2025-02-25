package csc402.week6;

class BinarySearchTree {
    TreeNode root;
    int size_right = 0;
    int size_left = 0;
    int size_total = 0;

    BinarySearchTree() {
        root = null;
    }

    void insert(int value) {
        root = insertRec(root, value);
    }

    TreeNode insertRec(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            size_total++;
            return root;
        }

        if (value < root.value) {
            size_left++;
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            size_right++;
            root.right = insertRec(root.right, value);
        }

        return root;
    }

    boolean search(int value) {
        return searchRec(root, value);
    }

    boolean searchRec(TreeNode root, int value) {
        if (root == null) {
            return false;
        }

        if (root.value == value) {
            return true;
        }

        if (value < root.value) {
            return searchRec(root.left, value);
        } else {
            return searchRec(root.right, value);
        }
    }

}
