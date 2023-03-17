package com.le.hellospring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {


    @Test
    void binarySearch() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(0, Solution.binarySearch(arr, 1));
        assertEquals(1, Solution.binarySearch(arr, 2));
        assertEquals(2, Solution.binarySearch(arr, 3));
        assertEquals(3, Solution.binarySearch(arr, 4));
        assertEquals(4, Solution.binarySearch(arr, 5));
        assertEquals(5, Solution.binarySearch(arr, 6));
        assertEquals(6, Solution.binarySearch(arr, 7));
        assertEquals(7, Solution.binarySearch(arr, 8));
        assertEquals(8, Solution.binarySearch(arr, 9));
        assertEquals(9, Solution.binarySearch(arr, 10));
        assertEquals(-1, Solution.binarySearch(arr, 11));
        assertEquals(-1, Solution.binarySearch(arr, 0));
    }

    @Test
    void printPermutations() {
    }

    @Test
    void isAnagram() {
    }

    @Test
    void isPalindrome() {
    }

    @Test
    void reverseString() {
    }

    @Test
    void reverseWords() {
    }

    @Test
    void reverseWordsInSentence() {
    }

    @Test
    void mergeSort() {
        int[] arr = getArr();
        Solution.mergeSort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            assertTrue(arr[i] <= arr[i + 1]);
        }
    }

    @Test
    void quickSort() {
        int[] arr = getArr();
        Solution.quickSort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            assertTrue(arr[i] <= arr[i + 1]);
        }
    }

    private static int[] getArr() {
        // Generate an array of 100 random numbers
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }



}