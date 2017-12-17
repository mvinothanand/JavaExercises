package com.vinothmasilamani;

/**
 * Created by vinoth on 24-Sep-17.
 */
public class Account {

    private String accountNumber;
    private String customerName;
    private double balance;
    private String email;
    private String phoneNumber;

    // Setter Method for Account Number
    public void setAccountNumber(String inputAcctNum){
        this.accountNumber=inputAcctNum;
        //System.out.println("Account Number set is : " + this.accountNumber);
    }

    // Getter method for account number
    public String getAccountNumber(){
        return this.accountNumber;
    }

    // Setter method for customer name
    public void setCustomerName(String inputCustName){
        this.customerName=inputCustName;
    }

    // Getter method for customer name
    public String getCustomerName(){
        return this.customerName;
    }

    // Setter method for balance
    public void setBalance(double inputAmount){
        this.balance = inputAmount;
    }

    // getter method for balance
    public double getBalance(){
        return this.balance;
    }

    // setter method for email
    public void setEmail(String inputEmail){
        this.email =  inputEmail;
    }

    // Getter method for email
    public String getEmail (){
        return this.email;
    }

    // Setter method for phone number
    public void setPhoneNumber(String inputPhoneNum){
        this.phoneNumber = inputPhoneNum;
    }

    // Getter method for phone number
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    // Method to deposit funds. Add balance to the account.
    public void depositFunds(double depositAmount){
        this.balance += depositAmount;
    }

    // Method to withdraw funds from account. Check if balance is available. If yes, deduct.
    public void withdrawFunds(double withdrawAmount){
        if(this.balance >= withdrawAmount){
            this.balance -= withdrawAmount;
        }
        else{
            System.out.println("!!! INSUFFICIENT BALANCE !!!");
        }
    }
}
