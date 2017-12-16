package com.vinothmasilamani;

/**
 * Created by vinoth on 15-Oct-17.
 */
public class HealthyHamburger extends Hamburger{

    AddOnItem addOn5 = null;
    AddOnItem addOn6 = null;

    public HealthyHamburger(String meatType) {
        super("Brown Rye Bread", meatType);
    }


    public boolean prepareBurger(AddOnItem addOn1, AddOnItem addOn2, AddOnItem addOn3, AddOnItem addOn4, AddOnItem addOn5, AddOnItem addOn6) {
        if(isValidAddOn(addOn1) && isValidAddOn(addOn2) && isValidAddOn(addOn3) && isValidAddOn(addOn4) && isValidAddOn(addOn5) && isValidAddOn(addOn6)) {
            setAddOn1(addOn1);
            setAddOn2(addOn2);
            setAddOn3(addOn3);
            setAddOn4(addOn4);
            this.addOn5= addOn5;
            this.addOn6 = addOn6;
            setNoOfAddtnlItems(6);

            setTotalCost(getAddOn1().getPrice() + getAddOn2().getPrice() + getAddOn3().getPrice() + getAddOn4().getPrice() + this.addOn5.getPrice() + this.addOn6.getPrice());
            System.out.println("Burger Prepared with " + getNoOfAddtnlItems() + " add on items: " + getAddOn1().getName() + " , " + getAddOn2().getName() + " , " + getAddOn3().getName() + " & " + getAddOn4().getName() + " & " + this.addOn5.getName() + " & " + this.addOn6.getName());
            return true;
        }
        else{
            return false;
        }

    }

    public boolean prepareBurger(AddOnItem addOn1, AddOnItem addOn2, AddOnItem addOn3, AddOnItem addOn4, AddOnItem addOn5) {
        if(isValidAddOn(addOn1) && isValidAddOn(addOn2) && isValidAddOn(addOn3) && isValidAddOn(addOn4) && isValidAddOn(addOn5)) {
            setAddOn1(addOn1);
            setAddOn2(addOn2);
            setAddOn3(addOn3);
            setAddOn4(addOn4);
            this.addOn5= addOn5;
            setNoOfAddtnlItems(5);

            setTotalCost(getAddOn1().getPrice() + getAddOn2().getPrice() + getAddOn3().getPrice() + getAddOn4().getPrice() + this.addOn5.getPrice());
            System.out.println("Burger Prepared with " + getNoOfAddtnlItems() + " add on items: " + getAddOn1().getName() + " , " + getAddOn2().getName() + " , " + getAddOn3().getName() + " & " + getAddOn4().getName() + " & " + this.addOn5.getName());
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean isValidAddOn(AddOnItem addOn) {
        if ((addOn.getName() != "Lettuce") && (addOn.getName() != "Carrot") && (addOn.getName() != "Olives") && (addOn.getName() != "Tomato") && (addOn.getName() != "Spinach") && (addOn.getName() != "Cheese")){
            System.out.println("Add On " + addOn.getName() + " not allowed in a healthy burger.");
            return false;
        }
        return true;
    }

    @Override
    public void getPriceDetails() {
        printBasePrice();
        printBasicAddOns();
        printHealthyAddOns();
        printTotalCost();
    }

    private void printHealthyAddOns(){
        if (getNoOfAddtnlItems() > 4){
            System.out.println("Add On Item 5: [" + this.addOn5.getName() + "] $" + this.addOn5.getPrice());
        }

        if (getNoOfAddtnlItems() > 5){
            System.out.println("Add On Item 6: [" + this.addOn6.getName() + "] $" + this.addOn6.getPrice());
        }

    }
}

