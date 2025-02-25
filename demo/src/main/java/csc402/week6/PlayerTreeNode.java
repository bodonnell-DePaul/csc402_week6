package csc402.week6;

public class PlayerTreeNode {
    PositionPlayer value;
    PlayerTreeNode left;
    PlayerTreeNode right;

    PlayerTreeNode(PositionPlayer value) {
        this.value = value;
        left = null;
        right = null;
    }
}
