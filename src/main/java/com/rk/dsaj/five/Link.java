package com.rk.dsaj.five;

/**
 * POJO representing a node in a linked list with int data type
 */
public class Link {

    private int data;
    private Link next;

    public Link() {
        this.next = null;
    }

    public Link(int data, Link next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Link getNext() {
        return this.next;
    }

    public void setNext(Link next) {
        this.next = next;
    }
}
