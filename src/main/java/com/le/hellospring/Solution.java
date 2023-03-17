package com.le.hellospring;

@SuppressWarnings("unused")
public class Solution {
    // 0. Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // 1. **String Permutations:** Write a program that prints all permutations of a given string.
    public static void printPermutations(String s) {
        printPermutations(s, "");
    }

    private static void printPermutations(String s, String s1) {
        if (s.length() == 0) {
            System.out.println(s1);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String s2 = s.substring(0, i) + s.substring(i + 1);
            printPermutations(s2, s1 + c);
        }
    }


    // 4. **Anagram Checker:** Write a program that checks whether two given strings are anagrams of each other.
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] charCount = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            charCount[s1.charAt(i) - 'a']++;
            charCount[s2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (charCount[i] != 0) {
                return false;
            }
        }
        return true;
    }
        
    // 5. **Palindrome Checker:** Write a program that checks whether a given string is a palindrome or not.
    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    // 6. **Reverse String:** Write a program that reverses a given string.
    public static String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    // 7. **Reverse Words:** Write a program that reverses the words in a given sentence.
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]).append(" ");
        }
        return sb.toString();
    }

    // 8. **Reverse Words in a Sentence:** Write a program that reverses the words in a given sentence, while preserving whitespace.
    public static String reverseWordsInSentence(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]).append(" ");
        }
        return sb.toString();
    }

    // 5. Binary Search: Write a program that implements a binary search algorithm
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // 6. Merge Sort: Write a program that implements a merge sort algorithm
    public static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int ti = 0;
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[ti++] = arr[i++];
            } else {
                temp[ti++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[ti++] = arr[i++];
        }
        while (j <= right) {
            temp[ti++] = arr[j++];
        }
        //noinspection ManualArrayCopy
        for (int l = 0; l < temp.length; l++) {
            arr[left + l] = temp[l];
        }
    }

    // 7. Quick Sort: Write a program that implements a quick sort algorithm
    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = arr[(left + right) / 2];
        int index = partition(arr, left, right, pivot);
        quickSort(arr, left, index - 1);
        quickSort(arr, index, right);
    }

    private static int partition(int[] arr, int left, int right, int pivot) {
        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }
            while (arr[right] > pivot) {
                right--;
            }
            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
