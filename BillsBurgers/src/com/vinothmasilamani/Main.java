package com.vinothmasilamani;

public class Main {

    public static void main(String[] args) {

        System.out.println("WELCOME TO BILL'S BURGER SHOP");

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("Brown","Chicken");
        deluxeHamburger.prepareBurger(new Cheese());
        deluxeHamburger.getPriceDetails();

        /*
        HealthyHamburger healthyHamBurger = new HealthyHamburger("Fish");
        healthyHamBurger.prepareBurger(new Spinach(), new Cheese(), new Tomato(), new Spinach(), new Lettuce(), new Carrot());
        healthyHamBurger.getPriceDetails();
*/

/*
        Hamburger hamburger = new Hamburger("Normal", "Chicken");
//        hamburger.prepareBurger(new Lettuce(), new Spinach());
        hamburger.prepareBurger();
        hamburger.getPriceDetails();
*/

/*
        Hamburger hamburger4 = new Hamburger("Normal", "Beef");
        hamburger4.prepareBurger(new Lettuce(), new Tomato(), new Carrot(), new Spinach());
        hamburger4.getPriceDetails();
*/



/*
        HealthyHamburger healthyHamburger = new HealthyHamburger("Beef");
        System.out.println(healthyHamburger.getBasePrice());

        System.out.println(healthyHamburger.prepareBurger(4));
*/

    }
}
