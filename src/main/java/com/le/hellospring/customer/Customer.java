package com.le.hellospring.customer;

@SuppressWarnings("unused")
public class Customer {
    private final String name;

    private final String email;

    private final String phone;

    Customer(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
