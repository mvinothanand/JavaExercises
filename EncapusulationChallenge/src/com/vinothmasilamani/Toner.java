package com.vinothmasilamani;

/**
 * Created by vinoth on 14-Oct-17.
 */
public class Toner {

    private double tonerLevel;

    public Toner(double tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public void setTonerLevel(double tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public void reduceTonerLevel(int noOfPages){
        this.tonerLevel -= (noOfPages * .5);
    }

    public double getTonerLevel() {
        return tonerLevel;
    }
}
