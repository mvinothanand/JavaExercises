package com.vinothmasilamani;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Vinoth", 25.78);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.45);
        System.out.println("Customer " + anotherCustomer.getName() + " has balance " + anotherCustomer.getBalance());

        Customer newCustomer = new Customer("Pragathi", 100.5);
        System.out.println("Customer " + newCustomer.getName() + " has balance " + newCustomer.getBalance());

        newCustomer = customer;
        System.out.println("Customer " + newCustomer.getName() + " has balance " + newCustomer.getBalance());

    }
}
