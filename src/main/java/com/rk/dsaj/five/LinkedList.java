package com.rk.dsaj.five;

public class LinkedList {

    private Link first;

    public LinkedList() {
        this.first = null;
    }

    /**
     * Inserts a new Link into the list.  The new item will be first on the list
     * @param data
     */
    public void insert(int data) {
        Link newLink = new Link();
        newLink.setData(data);
        newLink.setNext(first);
        first = newLink;
    }

    /**
     * Will remove the item at the head of the list and return the data value.  Will return 0 if the list is empty
     */
    public int remove() {
        int value = 0;
        if (!isEmpty()) {
            value = first.getData();
            first = first.getNext();
        }
        return value;
    }

    /**
     * Will print out the data in the list
     */
    public void displayListData() {
        System.out.println("Displaying Linked List Data: First --> Last");
        Link current = first;
        StringBuilder data = new StringBuilder();
        while (current != null) {
            data.append(current.getData()).append(" --> ");
            current = current.getNext();
        }
        data.append("null");
        System.out.println(data);
    }

    public int peek() {
        int value = 0;
        if (!isEmpty()) {
            value = first.getData();
        }
        return value;
    }

    public boolean isEmpty() {
        return first == null;
    }
}
