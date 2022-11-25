package com.leaning.binarytree;

public class SearchTreeNode {
    /*
    *         5
    *      3     8
    *   2    4
    *
    * */


    final int value;
    SearchTreeNode left;
    SearchTreeNode right;

    @Override
    public String toString() {
        return "SearchTreeNode{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

    public int getValue() {
        return value;
    }

    public SearchTreeNode getLeft() {
        return left;
    }

    public void setLeft(SearchTreeNode left) {
        this.left = left;
    }

    public SearchTreeNode getRight() {
        return right;
    }

    public void setRight(SearchTreeNode right) {
        this.right = right;
    }

    public SearchTreeNode(int value, SearchTreeNode left, SearchTreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public SearchTreeNode(int value) {
        this.value = value;
    }
}
