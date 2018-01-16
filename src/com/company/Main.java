package com.company;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Car myCar = new Car(500, 26.8, false);
        myCar.showProperties();
        myCar.setProperties();
        myCar.upgradeCar();
        myCar.showProperties();
    }
}
