package fufang.learning.java.oop.source;

public class NonElectricVehicle implements Vehicle{
    @Override
    public void sound() {

    }

    @Override
    public void refuel() {
        System.out.println("Petro");
    }
}
