package com.leaning.binarytree;

public class main {
    public static void main(String[] args) {

        SearchTree searchTree = new SearchTree();

        int[] array = {20,25,10,5};

        searchTree.addValue(array[0]);
        searchTree.addValue(array[1]);
        searchTree.addValue(array[2]);
        searchTree.addValue(array[3]);


        System.out.println(searchTree);




    }
}
