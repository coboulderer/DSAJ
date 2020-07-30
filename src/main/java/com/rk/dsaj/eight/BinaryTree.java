package com.rk.dsaj.eight;

public class BinaryTree {

    private Node root;

    /**
     * Attempts to find a node within the tree with the specified key value
     * @param key the key value to search for
     * @return The node with the specified key value. Will return null if key not found
     */
    public Node find(int key) {
        return find(this.root, key);
    }

    private Node find(Node node, int key) {
        if (node == null) {
            return null;
        } else if (key == node.key) {
            return node;
        } else if (key > node.key) {
            return find(node.rightChild, key);
        } else {
            return find(node.leftChild, key);
        }
    }

    /**
     * Will insert Key, Data into the tree.  If a Key value already exists within the tree, the data will be updated
     * to the value provided by this method.
     * @param key The Key to insert
     * @param data The data to insert
     */
    public void insert(int key, int data) {
        Node node = new Node(key, data);
        if (this.root != null) {
            insert(this.root, node);
        } else {
            this.root = node;
        }
    }

    private void insert(Node root, Node node) {
        if (root.key == node.key) {
            root.data = node.data;
        } else if (root.key > node.key) {
            if (root.leftChild != null) {
                insert(root.leftChild, node);
            } else {
                root.leftChild = node;
            }
        } else {
            if (root.rightChild != null) {
                insert(root.rightChild, node);
            } else {
                root.rightChild = node;
            }
        }
    }

    /**
     * Will print out the Value data within the tree in Ascending Order.
     */
    public void inOrderTraversal() {

    }

    public void delete(int key) {
        // TODO
    }

    public void balanceTree() {
        // TODO
    }
}
