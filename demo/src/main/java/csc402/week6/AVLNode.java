package csc402.week6;

class AVLNode {
    int value;
    AVLNode left;
    AVLNode right;
    int height;

    AVLNode(int value) {
        this.value = value;
        left = null;
        right = null;
        height = 1;
    }
}

