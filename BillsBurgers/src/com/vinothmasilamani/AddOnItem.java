package com.vinothmasilamani;

/**
 * Created by vinoth on 15-Oct-17.
 */
public class AddOnItem {

    private double price;
    private String name;

    public AddOnItem(String name, double price) {

        this.price = price;
        this.name=name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
