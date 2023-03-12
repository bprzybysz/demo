package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyApplication {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/primes")
    String primes(@RequestParam(value="n", defaultValue="10") int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                result.append(i).append(" ");
            }
        }
        return result.toString();
    }

    private boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

}

