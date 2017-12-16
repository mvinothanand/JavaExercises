package com.vinothmasilamani;

/**
 * Created by vinoth on 21-Oct-17.
 */
public class DeluxeHamburger extends Hamburger{
//    private AddOnItem addOnChips;
//    private AddOnItem addOnDrinks;

    public DeluxeHamburger(String breadRollType, String meatType) {
        super(breadRollType, meatType);
        setAddOn1(new Chips());
        setAddOn2(new Drinks());
        setNoOfAddtnlItems(2);
        setTotalCost(getAddOn1().getPrice() + getAddOn2().getPrice());
    }

    @Override
    public boolean isValidAddOn(AddOnItem addOn) {
        System.out.println("Add On " + addOn.getName() + " not allowed in a deluxe burger.");
        return false;

    }

    @Override
    public void getPriceDetails() {
        super.getPriceDetails();
    }
}
