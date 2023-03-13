package com.le.hellospring.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @GetMapping("/customer")
    Customer getCustomer() {
        return new Customer("Blaise", "bprzybys3@gmail.com", "+48514098060");
    }
}
