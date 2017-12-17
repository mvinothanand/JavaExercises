package com.vinothmasilamani;

/**
 * Created by vinoth on 01-Oct-17.
 */
public class Vehicle {

    private int noOfWheels;
    private String gearType;
    private String steeringType;
    private String fuelType;
    private int size;
    private int noOfPassengers;


    private int speed = 0;
    private int noOfGears = 5;
    private int gearPosition = 0;
    private boolean engineState = false;
    private String fuelLevel;


    public Vehicle(int noOfWheels, String gearType, String steeringType, String fuelType, int size, int noOfPassengers, int noOfGears) {
        this.noOfWheels = noOfWheels;
        this.gearType = gearType;
        this.steeringType = steeringType;
        this.fuelType = fuelType;
        this.size = size;
        this.noOfPassengers = noOfPassengers;
        this.noOfGears = noOfGears;
    }

    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    public int getSpeed() {
        return speed;
    }

    public void engineStart(){
        this.engineState = true;
        System.out.println("Vehicle.engineStart method: Engine started.");
    }

    public void engineOff(){
        this.engineState = false;
        System.out.println("Vehicle.engineOff method: " + " Engine switched off.");
    }

    public void changeGear(int newGearPosition){
        if(newGearPosition >= 0 && newGearPosition <= this.noOfGears) {
            this.gearPosition = newGearPosition;

            System.out.println("Vehicle.changeGear: " + "Gear changed to " + this.gearPosition);
        }
    }

    public void changeSpeed(int speed){
        this.speed += speed;

        System.out.println("Vehicle.changeSpeed : " + "Speed changed to " + this.speed);
    }

    public void applyBrake(String intent){

        switch(intent){
            case "STOP":
                slowdown();
                changeSpeed(-(this.speed));
                break;
            case "SLOWDOWN":
                changeSpeed(-10);
                break;
            default:
                changeSpeed(-10);
                break;
        }

        System.out.println("Vehicle.applyBrake: " + "Brake applied. New Speed " + this.speed);


    }

    public void move(){
        engineStart();
        changeGear(1);
        changeSpeed(10);
        changeGear(2);
        changeSpeed(20);

        System.out.println("Vehicle.move : " + "Vehicle set in motion at speed " + this.speed);
    }

    public void slowdown(){
        changeGear(this.gearPosition-1);
        applyBrake("SLOWDOWN");

        System.out.println("Vehicle.slowdown: " + "Vehicle slowed down. New speed " + this.speed);
    }

    public void stop(){

        while(this.speed > 10){
            slowdown();
        }

        changeGear(1);
        applyBrake("STOP");
        changeGear(0);
        engineOff();

        System.out.println("Vehicle.stop: " + "Vehicle stopped. New speed " + this.speed);
    }

    public void turn(String direction){
        System.out.println("Vehicle.turn: Turning " + direction);
    }

}
