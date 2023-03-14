package com.le.hellospring;

// Class Fizz Buzz
public class SpringSolution {
    public static String fizzBuzz() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.append("FizzBuzz");
            } else if (i % 3 == 0) {
                result.append("Fizz");
            } else if (i % 5 == 0) {
                result.append("Buzz");
            } else {
                result.append(i);
            }
            result.append(" ");
        }
        return result.toString();
    }
}
