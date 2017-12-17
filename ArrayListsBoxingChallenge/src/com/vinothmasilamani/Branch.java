package com.vinothmasilamani;

import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList<Customer> customerArrayList;

    public Branch(String branchName) {
        this.branchName = branchName;
        customerArrayList = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public boolean addNewCustomer(String customerName, double transactionAmount) {

        if(validateCustomer(customerName)){

            Customer customer = new Customer(customerName, transactionAmount);
            this.customerArrayList.add(customer);

            System.out.println("Customer " + customer.getCustomerName() + " added as the #" + (this.customerArrayList.indexOf(customer) + 1) + " of " + this.getBranchName() + " branch!");
            return true;
        }

        return false;
    }

    private boolean validateCustomer(String customerName){

        for(int i=0; i < this.customerArrayList.size(); i++){

            if(this.customerArrayList.get(i).getCustomerName().equals(customerName)){
                System.out.println(customerName + " is already a customer of " + this.getBranchName() + " branch.");
                return false;
            }
        }
        return true;
    }

    public void printAllCustomers(){

        System.out.println("List of customers in branch " + this.getBranchName());

        for(int i=0; i < this.customerArrayList.size(); i++){

            System.out.println("\t" + (i+1) + ". " + this.customerArrayList.get(i).getCustomerName());
        }
    }

    public Customer getCustomer(String customerName){

        for(int i=0; i < this.customerArrayList.size(); i++){

            if(this.customerArrayList.get(i).getCustomerName().equals(customerName)){
                return this.customerArrayList.get(i);
            }
        }

        return null;
    }

}
