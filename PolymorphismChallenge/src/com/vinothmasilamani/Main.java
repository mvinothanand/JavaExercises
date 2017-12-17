package com.vinothmasilamani;

public class Main {

    public static void main(String[] args) {

        for(int i=1; i<11;i++ ){
            Car car = randomCar();
            System.out.println(i + "." + car.getName() + ":  " + car.getNoOfCylinders() + " cylinders");
            //car.startEngine();
            //car.accelerate(10);
            //car.brake(10);
        }

    }

    public static Car randomCar(){

        int randomNumber = (int) (Math.random()*4) + 1;
        switch(randomNumber){
            case 1:
                return new i10();
            case 2:
                return new Accent();
            case 3:
                return new Fortuner();
            case 4:
                return new Ambassador();
            default:
                return null;
        }
    }


}

class Car{
    private boolean engine;
    private int wheels;
    private int noOfCylinders;
    private String name;
    private double velocity;

    public Car( int noOfCylinders, String name) {
        this.engine = true;
        this.wheels = 4;
        this.noOfCylinders = noOfCylinders;
        this.name = name;
        this.velocity = 0;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getNoOfCylinders() {
        return noOfCylinders;
    }

    public String getName() {
        return name;
    }

    public void startEngine(){
        System.out.println("Engine Started.");
    }

    public void accelerate(int speed){
        System.out.println("Accelerating the car.");
        this.velocity += speed;
    }

    public void brake(int speed){
        System.out.println("Braking");
        this.velocity -= speed;
    }

}

class i10 extends Car{
    public i10() {
        super(4, "i10");
    }
}

class Accent extends Car{

    public Accent(){
        super(5, "Accent");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Accelerating Accent car");
        super.accelerate(speed);
    }
}

class Fortuner extends Car{

    public Fortuner() {
        super(6, "Fortuner");
    }

    @Override
    public void brake(int speed) {
        System.out.println("Braking fortuner car");
        super.brake(speed);
    }
}

class Ambassador extends Car{
    public Ambassador() {
        super(4, "Ambassador");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting Ambassador.. Try again.. :)");
        super.startEngine();
    }
}