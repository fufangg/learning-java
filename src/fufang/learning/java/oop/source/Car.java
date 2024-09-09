package fufang.learning.java.oop.source;

public class Car {

    /**
     * Class and Object.
     * A class is a blueprint or template that defines the attributes (data) and behaviors (methods) that objects created from that class will have.
     * Think of a class as a concept or category. For example, you might have a class called Car,
     * which defines what a car is in terms of properties (like color, model, and speed) and methods (like drive, stop, and honk).
     * example attributes (or properties) color and model is having String type
     * speed is having an int type
     * example method (or function) drive() and stop() will print The car is driving and stopping
     */
    public String color;
    public String model;
    public Integer speed;

    /**
     *  Method to describe driving behavior
     */
    public void drive() {
        System.out.println("The car is driving.");
    }

    /**
     *  Method to stopping driving behavior
     */
    public void stop() {
        System.out.println("The car has stopped.");
    }

    /**
     * A Constructor is similar to method that helps you create value whenever you create new object from the classes.
     * Constructor can remain empty, or you can assign parameter to instantiate an object.
     * Do not confuse with parameter and the attributes. If you are using Intellij, the attributes will be colored purple
     * and the parameter will be colored white.
     * You can also create an option by filling the Constructor null value
     */
    public Car(String color, String model, Integer speed){
        this.color = color;
        this.model = model;
        this.speed = speed;
    }
    public Car(){
        this(null,null,null);
    }

    /*
      Challenge.
      Create a new attributes called "price" and method "outOfFuel"
     */

}
