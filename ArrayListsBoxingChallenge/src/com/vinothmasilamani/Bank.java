package com.vinothmasilamani;

import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Branch> branchArrayList;

    // Constructor to create a bank object along with a branch.
    public Bank(String bankName, String branchName) {
        this.bankName = bankName;
        this.branchArrayList = new ArrayList<Branch>();
        this.branchArrayList.add(new Branch(branchName));
    }

    // Constructor to create a bank object without any branch.
    public Bank(String bankName) {
        this.bankName = bankName;
        this.branchArrayList = new ArrayList<Branch>();
    }

    // Method to add a new branch to the bank object.
    public int addNewBranch(String branchName){
        Branch branch = new Branch(branchName);
        this.branchArrayList.add(branch);
        return (this.branchArrayList.indexOf(branch));
    }

    public ArrayList<Branch> getBranchArrayList() {
        return branchArrayList;
    }

    public String getBankName() {
        return bankName;
    }

    public Branch getBranch(String branchName){
        for(int i=0; i < this.branchArrayList.size(); i++){
            if(this.branchArrayList.get(i).getBranchName().equals(branchName) ){
                return this.branchArrayList.get(i);
            }
        }
        return null;
    }

    public void printAllBranches(){

        System.out.println("List of branches:");

        for(int i=0; i < this.branchArrayList.size(); i++){
            System.out.println("\t" + (i+1) + ". " + this.branchArrayList.get(i).getBranchName());
        }
    }

}
