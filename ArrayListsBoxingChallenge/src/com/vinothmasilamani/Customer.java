package com.vinothmasilamani;

import java.util.ArrayList;

public class Customer {

    private String customerName;
    private ArrayList<Double> transactionArrayList;

    // Constructor that adds a customer with an initial transaction amount.
    public Customer(String customerName, double transactionAmount) {

        this.customerName = customerName;
        transactionArrayList = new ArrayList<Double>();
        this.transactionArrayList.add(transactionAmount) ;
    }

    // Getter and setters
    public ArrayList<Double> getTransactionArrayList() {
        return transactionArrayList;
    }

    public void setTransactionArrayList(double transactionAmount) {
        this.transactionArrayList.add(transactionAmount);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void printAllTransactions(){
        System.out.println("List of transactions of customer " + this.getCustomerName());
        for(int i=0; i < this.transactionArrayList.size(); i++){
            System.out.println("\t" + (i+1) + ". " + this.transactionArrayList.get(i));
        }
    }

/*
    private boolean validateTransactionAmount(double transactionAmount){
        if(transactionAmount <= 0){
            System.out.println("Transaction amount should be greater than 0.");
            return false;
        }
        return true;
    }
*/
}
