package com.company;

public class Car {
    int maxSpeed;
    double mileage;
    boolean isCarReady;

    public Car(int customMaxSpeed, double customMileage, boolean custIsCarReady){
        maxSpeed = customMaxSpeed;
        mileage = customMileage;
        isCarReady = custIsCarReady;
    }

    //getter and setter
    public int getMaxSpeed(){
        return this.maxSpeed;
    }

    public double getMileage(){
        return this.mileage;
    }

    public boolean getCarReady(){ return this.isCarReady; }

    public void setMaxSpeed(int mSpeed){this.maxSpeed = mSpeed;}

    public void setMileage(double mileage){this.mileage = mileage;}

    public void setCarReady(boolean isCarReady){this.isCarReady = isCarReady;}

    public void showProperties(){
        System.out.println("Max Speed - " + getMaxSpeed());
        System.out.println("Car Mileage - " + getMileage());
        System.out.println("Is car ready? - " + getCarReady());
    }

    public void setProperties(){
        setMaxSpeed(200);
        setMileage(15);
        setCarReady(true);
    }

    public void upgradeCar(){
        setMaxSpeed(getMaxSpeed()+20);
        setMileage(getMileage()+2);
        setCarReady(!getCarReady());
    }
}
