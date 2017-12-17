package com.vinothmasilamani;

public class Main {

    public static void main(String[] args) {

        Suv mySuv = new Suv(4,"AUTOMATIC", "POWER", "DIESEL",
                10, 7, 6, "HYUNDAI",4, false, true);

        mySuv.move();

        mySuv.changeSpeed(40);

        mySuv.turn("Right");

        mySuv.changeSpeed(40);

        System.out.println("Main: " + mySuv.getSpeed());

        mySuv.convertCar("OPEN");

        mySuv.slowdown();

        mySuv.stop();

        System.out.println("Main: " + mySuv.getSpeed());
    }
}
