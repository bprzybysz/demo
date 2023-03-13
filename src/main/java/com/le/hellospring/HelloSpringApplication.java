package com.le.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloSpringApplication {

    @RequestMapping("/primes")
    public String primes(@RequestParam(value = "n", defaultValue = "100") int n)
    {
        return Solution.primes(n);
    }

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        SpringApplication.run(HelloSpringApplication.class, args);
    }

}
