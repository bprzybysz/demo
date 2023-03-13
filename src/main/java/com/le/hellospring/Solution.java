package com.le.hellospring;

public class Solution {
    public static String primes(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                result.append(i).append(" ");
            }
        }
        return result.toString();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
