package com.rk.dsaj.eight;

public class Node {

    public int key;
    public int data;
    public Node leftChild;
    public Node rightChild;

    public Node(int key, int data) {
        this.key = key;
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }

    public void displayNode() {
        System.out.println("Key: " + key);
        System.out.println("Data: " + data);
    }
}
