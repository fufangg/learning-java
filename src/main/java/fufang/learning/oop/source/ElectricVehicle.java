package fufang.learning.oop.source;

public class ElectricVehicle implements Vehicle{
    @Override
    public void sound() {
        System.out.println("Inaudible");
    }

    @Override
    public void refuel() {
        System.out.println("Battery");
    }

}
