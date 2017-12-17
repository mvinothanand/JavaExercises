package com.vinothmasilamani;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
//    public static Bank bank;

    public static void main(String[] args) {
        int chosenOption;
        boolean quit = false;
        System.out.println("Hello!! Welcome!!");
//        Bank bank = createBank();
        Bank bank = new Bank("ABC");

        while(!quit){

            chosenOption = showOptions();
            switch(chosenOption){
                case 0:
                    break;
                case 1:
                    addBranch(bank);
                    break;
                case 2:
                    addCustomer(bank);
                    break;
                case 3:
                    postTransaction(bank);
                    break;
                case 4:
                     listAllBranches(bank);
                     break;
                case 5:
                    listAllCustomers(bank);
                    break;
                case 6:
                    listAllTransactions(bank);
                    break;
                case 9:
                    quit = true;
                    break;
                default:
                    break;
            }
        }
    }

    public static int showOptions(){

        System.out.println("\n Please choose an option below to continue:");
        System.out.println("\t 1. Add a Branch");
        System.out.println("\t 2. Add a Customer to a branch");
        System.out.println("\t 3. Post a transaction to customer");
        System.out.println("\t 4. List all branches");
        System.out.println("\t 5. List all customers");
        System.out.println("\t 6. List all transactions");
        System.out.println("\t 0. Show Options");
        System.out.println("\t 9. Quit");
//        scanner.nextLine();

        int option = scanner.nextInt();

//        return(scanner.nextLine().toUpperCase().charAt(0));
        return(option);
    }

    public static Bank createBank(){

        Bank bank;

        System.out.println("What do you want your bank to be called? ");
        String bankName = scanner.nextLine().toUpperCase();

        System.out.println("Do you want to add a branch (Y/N)? (You can add later as well) ");
        char yesOrNo = scanner.nextLine().toUpperCase().charAt(0);

        if(yesOrNo == 'Y'){
            System.out.println("What do you want the branch to be called? ");
            String branchName = scanner.nextLine().toUpperCase();
//            System.out.println("Branch name is " + branchName);
            bank = new Bank(bankName, branchName);
        }
        else{

            bank = new Bank(bankName);
        }

        return bank;
    }

    public static boolean addBranch(Bank bank){

        System.out.println("What do you want the branch to be called? ");
        String branchName = scanner.next().toUpperCase();
        //String branchName = scanner.nextLine().toUpperCase();
        System.out.println("Branch name is " + branchName);
        int i = bank.addNewBranch(branchName);

        if(i < 0){
            return false;
        }

        System.out.println(bank.getBranchArrayList().get(i).getBranchName() + " is #" + (i+1) + " branch of " + bank.getBankName() + " bank");
        return true;
    }

    public static void addCustomer(Bank bank){
        scanner.nextLine();
        System.out.println("Provide the branch name to which the new customer is to be added: ");
        String branchName = scanner.nextLine().toUpperCase();

        if(bank.getBranch(branchName) == null){
            System.out.println("Branch does not exist.");
            return;
        }

        System.out.println("What is the name of the Customer? ");
        String customerName = scanner.nextLine().toUpperCase();

        System.out.println("What is the initial deposit amount? ");
        double initialDeposit = scanner.nextDouble();

        bank.getBranch(branchName).addNewCustomer(customerName, initialDeposit);

    }

    public static void listAllBranches(Bank bank){
        bank.printAllBranches();
    }

    public static void listAllCustomers(Bank bank){
        scanner.nextLine();
        System.out.println("Provide the name of the branch: ");
        String branchName = scanner.nextLine().toUpperCase();

        if(bank.getBranch(branchName) == null){
            System.out.println("Branch does not exist.");
            return;
        }

        bank.getBranch(branchName).printAllCustomers();
    }

    public static void postTransaction(Bank bank){
        scanner.nextLine();
        System.out.println("Provide the customer's branch name: ");
        String branchName = scanner.nextLine().toUpperCase();

        Branch branch = bank.getBranch(branchName);

        if(branch == null){
            System.out.println("Branch does not exist.");
            return;
        }
        scanner.nextLine();

        System.out.println("Provide the name of the customer : ");
        String customerName = scanner.nextLine().toUpperCase();

        Customer customer = bank.getBranch(branchName).getCustomer(customerName);

        if(customer == null){
            System.out.println("Customer " + customerName + " not found.");
            return;
        }

//        scanner.nextLine();
        System.out.println("How much amount to be posted? ");
        double transactionAmount = scanner.nextDouble();

        customer.setTransactionArrayList(transactionAmount);

    }

    public static void listAllTransactions(Bank bank){
        scanner.nextLine();
        System.out.println("Provide the customer's branch name: ");
        String branchName = scanner.nextLine().toUpperCase();

        Branch branch = bank.getBranch(branchName);

        if(branch == null){
            System.out.println("Branch does not exist.");
            return;
        }
//        scanner.nextLine();

        System.out.println("Provide the name of the customer : ");
        String customerName = scanner.nextLine().toUpperCase();

        Customer customer = bank.getBranch(branchName).getCustomer(customerName);

        if(customer == null){
            System.out.println("Customer " + customerName + " not found.");
            return;
        }

        customer.printAllTransactions();

    }
}
