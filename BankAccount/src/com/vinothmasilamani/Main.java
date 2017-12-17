package com.vinothmasilamani;

public class Main {

    public static void main(String[] args) {

        // Create an object "savings" and initialize it.
        Account savings = new Account();

        // Set & Get for account number.
        savings.setAccountNumber("SAV1-12345");
        System.out.println("Account number: " + savings.getAccountNumber());

        // Set & Get for customer name.
        savings.setCustomerName("VINOTH ANAND MASILAMANI");
        System.out.println("Customer name: " + savings.getCustomerName());

        // Set & Get initial balance.
        savings.setBalance(0);
        System.out.println("Balance in the account : " + savings.getBalance());

        // Set & Get email address.
        savings.setEmail("vinoth.anand@gmail.com");
        System.out.println("Email address: " + savings.getEmail());

        // Set & get phone number.
        savings.setPhoneNumber("0434588920");
        System.out.println("Phone number: " + savings.getPhoneNumber());

        // Deposit
        savings.depositFunds(1000.00);
        System.out.println(savings.getBalance());

        //Withdraw
        savings.withdrawFunds(999.00);
        System.out.println(savings.getBalance());

        //Creating a VIP Customer
        VipCustomer vinoth = new VipCustomer("Vinoth", "vinoth.anand@gmail.com");
        System.out.println("Name : " + vinoth.getName() + "; Credit Limit : " + vinoth.getCreditLimit() + "; Email Address : "+ vinoth.getEmailAddress());

        VipCustomer sangee = new VipCustomer("Saneetha",10000.00, "sangeethakumar87@gmail.com");
        System.out.println("Name : " + sangee.getName() + "; Credit Limit : " + sangee.getCreditLimit() + "; Email Address : "+ sangee.getEmailAddress());

        VipCustomer praga = new VipCustomer();
        System.out.println("Name : " + praga.getName() + "; Credit Limit : " + praga.getCreditLimit() + "; Email Address : "+ praga.getEmailAddress());

    }
}
