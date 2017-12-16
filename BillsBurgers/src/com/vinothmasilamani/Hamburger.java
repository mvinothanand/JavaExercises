package com.vinothmasilamani;

/**
 * Created by vinoth on 15-Oct-17.
 */
public class Hamburger {
    private String breadRollType;
    private String meatType;
    private double basePrice;

    private AddOnItem addOn1=null;
    private AddOnItem addOn2=null;
    private AddOnItem addOn3=null;
    private AddOnItem addOn4=null;

    private int noOfAddtnlItems=0;
    private double totalCost=0;


    public Hamburger(String breadRollType, String meatType)  {
        this.breadRollType = breadRollType;
        this.meatType = meatType;
        this.basePrice = 8;
    }

    public void setAddOn1(AddOnItem addOn1) {
        this.addOn1 = addOn1;
    }

    public void setAddOn2(AddOnItem addOn2) {
        this.addOn2 = addOn2;
    }

    public void setAddOn3(AddOnItem addOn3) {
        this.addOn3 = addOn3;
    }

    public void setAddOn4(AddOnItem addOn4) {
        this.addOn4 = addOn4;
    }

    public void setNoOfAddtnlItems(int noOfAddtnlItems) {
        this.noOfAddtnlItems = noOfAddtnlItems;
    }

    public AddOnItem getAddOn1() {
        return addOn1;
    }

    public AddOnItem getAddOn2() {
        return addOn2;
    }

    public AddOnItem getAddOn3() {
        return addOn3;
    }

    public AddOnItem getAddOn4() {
        return addOn4;
    }

    public int getNoOfAddtnlItems() {
        return noOfAddtnlItems;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double addOnCosts) {
        this.totalCost = getBasePrice() + addOnCosts;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public boolean prepareBurger(AddOnItem addOn1,AddOnItem addOn2, AddOnItem addOn3, AddOnItem addOn4){

        if(isValidAddOn(addOn1) && isValidAddOn(addOn2) && isValidAddOn(addOn3) && isValidAddOn(addOn4)) {
            this.addOn1 = addOn1;
            this.addOn2 = addOn2;
            this.addOn3 = addOn3;
            this.addOn4 = addOn4;
            this.noOfAddtnlItems = 4;
            System.out.println("Burger Prepared with " + this.noOfAddtnlItems + " add on items: " + addOn1.getName() + " , " + addOn2.getName() + " , " + addOn3.getName() + " & " + addOn4.getName());
            setTotalCost(this.addOn1.getPrice() + this.addOn2.getPrice() + this.addOn3.getPrice() + this.addOn4.getPrice());
            return true;
        }
        else{
            return false;
        }
    }

    public boolean prepareBurger(AddOnItem addOn1,AddOnItem addOn2, AddOnItem addOn3){
        if(isValidAddOn(addOn1) && isValidAddOn(addOn2) && isValidAddOn(addOn3)) {
            this.addOn1 = addOn1;
            this.addOn2 = addOn2;
            this.addOn3 = addOn3;
            this.noOfAddtnlItems = 3;
            System.out.println("Burger Prepared with " + this.noOfAddtnlItems + " add on items: " + addOn1.getName() + " , " + addOn2.getName() + " & " + addOn3.getName());
            setTotalCost(this.addOn1.getPrice() + this.addOn2.getPrice() + this.addOn3.getPrice());
            return true;
        }
        else{
            return false;
        }
    }

    public boolean prepareBurger(AddOnItem addOn1,AddOnItem addOn2){
        if(isValidAddOn(addOn1) && isValidAddOn(addOn2)){
            this.addOn1 = addOn1;
            this.addOn2 = addOn2;
            this.noOfAddtnlItems = 2;
            System.out.println("Burger Prepared with " + this.noOfAddtnlItems + "  add on items: " + addOn1.getName() + " & " + addOn2.getName());
            setTotalCost(this.addOn1.getPrice() + this.addOn2.getPrice());
            return true;
        }
        else{
            return false;
        }
    }

    public boolean prepareBurger(AddOnItem addOn1){
        if(isValidAddOn(addOn1)){
            this.addOn1 = addOn1;
            this.noOfAddtnlItems=1;
            System.out.println("Burger Prepared with " + this.noOfAddtnlItems + "  add on item: " + addOn1.getName());
            setTotalCost(this.addOn1.getPrice());
            return true;
        }
        else{
            return false;
        }
    }

    public boolean prepareBurger(){
        //setTotalCost(getBasePrice());
        return true;
    }

    public void getPriceDetails(){
        printBasePrice();
        printBasicAddOns();
        printTotalCost();
    }

    public boolean isValidAddOn(AddOnItem addOn){

        if ((addOn.getName() != "Lettuce") && (addOn.getName() != "Carrot") && (addOn.getName() != "Olives") && (addOn.getName() != "Tomato")){
            System.out.println("Add On " + addOn.getName() + " not allowed in a basic burger.");
            return false;
        }
        return true;
    }

    public void printBasePrice(){
        System.out.println("-- P R I C E  D E T A I L S --");
        System.out.println("Basic Burger : $" + getBasePrice());
    }

    public void printBasicAddOns(){
        if (this.noOfAddtnlItems > 0){
            System.out.println("Add On Item 1: [" + this.addOn1.getName() + "] $" + this.addOn1.getPrice());
        }

        if (this.noOfAddtnlItems > 1){
            System.out.println("Add On Item 2: [" + this.addOn2.getName() + "] $" + this.addOn2.getPrice());
        }

        if (this.noOfAddtnlItems > 2){
            System.out.println("Add On Item 3: [" + this.addOn3.getName() + "] $" + this.addOn3.getPrice());
        }

        if (this.noOfAddtnlItems > 3){
            System.out.println("Add On Item 4: [" + this.addOn4.getName() + "] $" + this.addOn4.getPrice());
        }

    }

    public void printTotalCost(){
        System.out.println("TOTAL: $" + totalCost);
    }
}
