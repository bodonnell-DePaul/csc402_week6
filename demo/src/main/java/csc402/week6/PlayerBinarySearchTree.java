package csc402.week6;

class PlayerBinarySearchTree {
    PlayerTreeNode root;
    String searchValue = "WPA";
    int size_right = 0;
    int size_left = 0;
    int size_total = 0;

    PlayerBinarySearchTree() {
        root = null;
    }

    void insert(PositionPlayer value) {
        root = insertRec(root);
    }

    PlayerTreeNode insertRec(PositionPlayer value) {
        if (root == null) {
            root = new PlayerTreeNode(value);
            size_total++;
            return root;
        }

        if (Double.parseDouble(value.getAttribute(searchValue)) < Double.parseDouble(root.value.getAttribute(searchValue))) {
            size_left++;
            root.left = insertRec(root.left.value);
        } else if (Double.parseDouble(value.getAttribute(searchValue)) > Double.parseDouble(root.value.getAttribute(searchValue)))) {
            size_right++;
            root.right = insertRec(root.right.value);
        }

        return root;
    }

    boolean search(int value) {
        return searchRec(root, value);
    }

    boolean searchRec(PlayerTreeNode root) {
        if (root == null) {
            return false;
        }

        if (root.value.getAttribute(searchValue) == value.getAttribute(searchValue)) {
            return true;
        }

        if (value.getAttribute(searchValue) < root.value.getAttribute(searchValue)) {
            return searchRec(root.left, value);
        } else {
            return searchRec(root.right, value);
        }
    }

}
