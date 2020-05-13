package com.rk.dsaj.five;

public class DoubleEndedLinkedList {

    private Link first;
    private Link last;

    public DoubleEndedLinkedList() {
        this.first = null;
        this.last = null;
    }

    public void insertFirst(int data) {
        if (isEmpty()) {
            this.first = new Link();
            first.setData(data);
            this.last = this.first;
        } else {
            Link newLink = new Link();
            newLink.setData(data);
            newLink.setNext(first);
            first = newLink;
        }
    }

    public int peekFirst() {
        int value = 0;
        if (!isEmpty()) {
            value = first.getData();
        }
        return value;
    }

    public void insertLast(int data) {
        if (isEmpty()) {
            insertFirst(data);
        } else {
            Link newLink = new Link();
            newLink.setData(data);
            last.setNext(newLink);
            last = newLink;
        }
    }

    public int peekLast() {
        int value = 0;
        if (!isEmpty()) {
            value = last.getData();
        }
        return value;
    }

    public int remove() {
        int value = 0;
        if (!isEmpty()) {
            value = first.getData();
            first = first.getNext();
        }
        return value;
    }

    public void printList() {
        // TODO
    }

    public boolean isEmpty() {
        return first == null;
    }
}
