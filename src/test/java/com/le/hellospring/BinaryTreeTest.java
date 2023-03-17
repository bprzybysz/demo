package com.le.hellospring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    private BinaryTree tree;

    @BeforeEach
    void setUp() {
        tree = new BinaryTree();
    }

    @Test
    void insertAndLookup() {
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        tree.insert(8);
        tree.insert(9);
        tree.insert(10);
        assertTrue(tree.lookup(1));
        assertTrue(tree.lookup(2));
        assertTrue(tree.lookup(3));
        assertTrue(tree.lookup(4));
        assertTrue(tree.lookup(5));
        assertTrue(tree.lookup(6));
        assertTrue(tree.lookup(7));
        assertTrue(tree.lookup(8));
        assertTrue(tree.lookup(9));
        assertTrue(tree.lookup(10));
        assertFalse(tree.lookup(11));
        assertFalse(tree.lookup(0));
    }

    @Test
    void size() {
        assertEquals(0, tree.size());
        tree.insert(1);
        assertEquals(1, tree.size());
        tree.insert(2);
        assertEquals(2, tree.size());
        tree.insert(3);
        assertEquals(3, tree.size());
        tree.insert(4);
        assertEquals(4, tree.size());
        tree.insert(5);
        assertEquals(5, tree.size());
        tree.insert(6);
        assertEquals(6, tree.size());
        tree.insert(7);
        assertEquals(7, tree.size());
        tree.insert(8);
        assertEquals(8, tree.size());
        tree.insert(9);
        assertEquals(9, tree.size());
        tree.insert(10);
        assertEquals(10, tree.size());
    }

    @Test
    void maxDepth() {
        tree.insert(9);
        tree.insert(8);
        tree.insert(7);
        tree.insert(6);
        tree.insert(10);
        assertEquals(tree.maxDepth(), 4);
        tree.insert(11);
        tree.insert(12);
        tree.insert(13);
        assertEquals(tree.maxDepth(), 5);
    }

    @Test
    void minMaxValue() {
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        assertEquals(tree.minValue(), 1);
        assertEquals(tree.maxValue(), 5);
    }
}