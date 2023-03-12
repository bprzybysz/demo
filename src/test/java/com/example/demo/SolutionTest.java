package com.example.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void maxSubArray() {
        assertEquals(6, solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        assertEquals(23, solution.maxSubArray(new int[]{5, 4, -1, 7, 8}));
        assertEquals(1, solution.maxSubArray(new int[]{1}));
        assertEquals(0, solution.maxSubArray(new int[]{0}));
        assertEquals(-1, solution.maxSubArray(new int[]{-1}));
    }
}