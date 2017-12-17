package com.vinothmasilamani;
/**
 * Created by vinoth on 01-Oct-17.
 */
public class Car extends Vehicle {

    private String company;
    private int noOfDoors;
    private boolean isConvertible;
    private boolean is4WD;

    private String convertibleState;

    public Car(int noOfWheels, String gearType, String steeringType, String fuelType, int size, int noOfPassengers, int noOfGears, String company, int noOfDoors, boolean isConvertible, boolean is4WD) {
        super(noOfWheels, gearType, steeringType, fuelType, size, noOfPassengers, noOfGears);
        this.company = company;
        this.noOfDoors = noOfDoors;
        this.isConvertible = isConvertible;
        this.is4WD = is4WD;
    }

    @Override
    public void applyBrake(String intent) {
        super.applyBrake(intent);
        System.out.println("Car.applyBrake() invoked. Car " + intent + " done.");
    }

    @Override
    public void changeSpeed(int speed) {
        super.changeSpeed(speed);
        System.out.println("Car.changeSpeed invoked. Car speed changed by " + speed);
    }

    public void convertCar(String convertibleState){
        if(convertibleState == "OPEN"){
            this.convertibleState = "OPEN";
        }
        else{
            this.convertibleState = "CLOSED";
        }

        System.out.println("Car.convertCar invoked. New State : " + this.convertibleState);
    }
}
