package fufang.learning.java.oop.app;

import fufang.learning.java.oop.source.Car;

public class ClassApp {
    public static void main(String[] args) {
        // Create an object of the Car class
        Car myCar = new Car();

        // Assign values to the attributes of myCar
        myCar.color = "Red";
        myCar.model = "Tesla Model S";
        myCar.speed = 100;

        // Call the methods on the object
        myCar.drive();
        myCar.stop();

        // Display some object properties
        System.out.println("Car model: " + myCar.model);
        System.out.println("Car color: " + myCar.color);

    }
}
