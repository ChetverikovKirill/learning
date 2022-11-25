package com.leaning.binarytree;

public class SearchTree {

    SearchTreeNode root = null;

    public void addValue(int value) {
        root = addRecursive(root, value);
    }

    private SearchTreeNode addRecursive(SearchTreeNode current, int value) {
        if (current == null) {
            return new SearchTreeNode(value);
        }
        if (value < current.getValue()) {
            current.setLeft(addRecursive(current.getLeft(), value));
        } else if (value > current.getValue()) {
            current.setRight(addRecursive(current.getRight(), value));
        } else {
            return current;
        }
        return current;
    }

    @Override
    public String toString() {
        return "SearchTree{" +
                "root=" + root +
                '}';
    }

}

