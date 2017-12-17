package com.vinothmasilamani;

/**
 * Created by vinoth on 01-Oct-17.
 */
public class Suv extends Car {

    public Suv(int noOfWheels, String gearType, String steeringType, String fuelType, int size, int noOfPassengers, int noOfGears, String company, int noOfDoors, boolean isConvertible, boolean is4WD) {
        super(noOfWheels, gearType, steeringType, fuelType, size, noOfPassengers, noOfGears, company, noOfDoors, isConvertible, is4WD);
    }

    public void switch4WD(){
        System.out.println("Suv.switch4WD: Switching on to 4 WD.");
    }

    @Override
    public void move() {
        this.switch4WD();
        super.move();
        System.out.println("Suv.move() invoked. Suv set in motion." + getSpeed());
    }


}
