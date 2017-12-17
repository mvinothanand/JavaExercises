package com.vinothmasilamani;

/**
 * Created by vinoth on 30-Sep-17.
 */
public class VipCustomer {

    // Declaring the fields
    private String name;
    private double creditLimit;
    private String emailAddress;

    // Default constructor
    public VipCustomer(){

        this("Pragathi",20000.0, "default@gmail.com");
        System.out.println("In the default constructor");
    }

   //Constructor that accepts 2 values and sets a default to other
    public VipCustomer(String name, String emailAddress){
        this(name,5000.00,emailAddress);
    }

    //Constructor which accepts and saves all three input fields
    public VipCustomer(String name, double creditLimit, String emailAddress){
        //this(name, creditLimit, emailAddress);
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    //Getters


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
