package com.le.hellospring;

// Implement a binary tree class
public class BinaryTree {
    // Root node pointer. Will be null for an empty tree.
    private Node root;

    /**
     * Creates an empty binary tree -- a null root pointer.
     */
    public BinaryTree() {
        root = null;
    }

    /**
     * Returns true if the given target is in the binary tree.
     * Uses a recursive helper.
     */
    public boolean lookup(int data) {
        return (lookup(root, data));
    }

    /**
     * Recursive lookup  -- given a node, recur
     * down searching for the given data.
     */
    private boolean lookup(Node node, int data) {
        if (node == null) {
            return (false);
        }

        if (data == node.data) {
            return (true);
        } else if (data < node.data) {
            return (lookup(node.left, data));
        } else {
            return (lookup(node.right, data));
        }
    }

    /**
     * Inserts the given data into the binary tree.
     * Uses a recursive helper.
     */
    public void insert(int data) {
        root = insert(root, data);
    }

    /**
     * Recursive insert -- given a node pointer, recur down and
     * insert the given data into the tree. Returns the new
     * node pointer (the standard way to communicate
     * a changed pointer back to the caller).
     */
    private Node insert(Node node, int data) {
        if (node == null) {
            node = new Node(data);
        } else {
            if (data <= node.data) {
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }
        }

        return (node); // in any case, return the new reference to the caller
    }

    /**
     * Returns the number of nodes in the tree.
     * Uses a recursive helper that recurs
     * down
     * the tree and counts the nodes.
     */
    public int size() {
        return (size(root));
    }

    private int size(Node node) {
        if (node == null) return 0;
        else {
            return (size(node.left) + 1 + size(node.right));
        }
    }

    /**
     * Returns the max root-to-leaf depth of the tree.
     * Uses a recursive helper that recurs down to find
     * the max depth.
     */
    public int maxDepth() {
        return (maxDepth(root));
    }

    private int maxDepth(Node node) {
        if (node == null) return 0;
        else {
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            // use the larger + 1
            return (Math.max(lDepth, rDepth) + 1);
        }
    }

    /**
     * Returns the min value in a non-empty binary search tree.
     * Uses a helper method that iterates to the left to find
     * the min value.
     */
    public int minValue() {
        return (minValue(root));
    }

    private int minValue(Node node) {
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return (current.data);
    }

    /**
     * Returns the max value in a non-empty binary search tree.
     * Uses a helper method that iterates to the right to find
     * the max value.
     */
    public int maxValue() {
        return (maxValue(root));
    }

    private int maxValue(Node node) {
        Node current = node;
        while (current.right != null) {
            current = current.right;
        }
        return (current.data);
    }

    /*
     --Node--
     The binary tree is built using this nested node class.
     Each node stores one data element, and has left and right
     subtree pointer which may be null.
     The node is a "dumb" nested class -- we just use it for
     storage; it does not have any methods.
     */
    private static class Node {
        Node left;
        Node right;
        int data;

        Node(int newData) {
            left = null;
            right = null;
            data = newData;
        }
    }


}

