package com.rk.dsaj.five;

public class DoublyLinkedList {

    private DoubleLink first;
    private DoubleLink current;

    public DoublyLinkedList() {
        this.first = null;
    }

    /**
     * Basic Insert - Will add the item to the front of Linked List
     * @param data
     */
    public void insert(int data) {
        DoubleLink newLink = new DoubleLink();
        newLink.setData(data);
        newLink.setNext(first);
        if (first != null) {
            first.setPrevious(newLink);
        }
        first = newLink;
    }

    /**
     * Will attempt to insert data after a specified key.  If the list is empty or the key cannot be found, then the
     * data will be inserted at the front of the list
     * @param dataToInsert
     * @param afterKey
     */
    public void insertAfter(int dataToInsert, int afterKey) {
        boolean foundKey = searchForCurrent(afterKey);
        if (foundKey && this.current != null) {
            DoubleLink newLink = new DoubleLink();
            newLink.setData(dataToInsert);
            DoubleLink afterCurrent = this.current.getNext();
            newLink.setNext(afterCurrent);
            if (afterCurrent != null) {
                afterCurrent.setPrevious(newLink);
            }
            newLink.setPrevious(this.current);
            this.current.setNext(newLink);
        } else {
            insert(dataToInsert);
        }
    }

    private boolean searchForCurrent(int searchKey) {
        boolean found = false;
        this.current = null;
        if (!isEmpty()) {
            this.current = this.first;
            do {
                if (this.current.getData() == searchKey) {
                    found = true;
                } else {
                    this.current = this.current.getNext();
                }
            } while (this.current != null && !found);
        }
        return found;
    }

    /**
     *
     * @param dataToInsert
     * @param beforeKey
     */
    public void insertBefore(int dataToInsert, int beforeKey) {
        boolean foundKey = searchForCurrent(beforeKey);
        if (foundKey && this.current != null) {
            DoubleLink newLink = new DoubleLink();
            newLink.setData(dataToInsert);
            DoubleLink beforeCurrent = this.current.getPrevious();
            newLink.setNext(this.current);
            if (beforeCurrent != null) {
                beforeCurrent.setNext(newLink);
            }
            newLink.setPrevious(beforeCurrent);
            this.current.setPrevious(newLink);
            if (this.current == this.first) {
                this.first = newLink;
            }
        } else {
            insert(dataToInsert);
        }
    }

    /**
     * Removes the item at the front of the list
     * @return The data value at the front of the list.  If the list is empty zero will be returned
     */
    public int remove() {
        int value = 0;
        if (!isEmpty()) {
            value = first.getData();
            first = first.getNext();
            if (first != null) {
                first.setPrevious(null);
            }
        }
        return value;
    }

    public void displayList() {
        System.out.println("Displaying Linked List Data: First <--> ... <--> Last");
        DoubleLink current = first;
        StringBuilder data = new StringBuilder();
        while (current != null) {
            data.append(current.getData()).append(" <--> ");
            current = current.getNext();
        }
        data.append("null");
        System.out.println(data);
    }

    /**
     * Will return the data value at the front of the list without removing it
     * @return The data value at the front, will return zero if the list is empty
     */
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
