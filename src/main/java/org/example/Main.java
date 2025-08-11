package org.example;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine();
        String status = myCar.drive(60);
        System.out.println(status);
        myCar.turnOffEngine();
    }
}