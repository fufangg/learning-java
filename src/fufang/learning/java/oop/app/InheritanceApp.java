package fufang.learning.java.oop.app;

import fufang.learning.java.oop.source.ElectricVehicle;
import fufang.learning.java.oop.source.NonElectricVehicle;
import fufang.learning.java.oop.source.Vehicle;

public class InheritanceApp {
    public static void main(String[] args) {
        /*
          Challenge.
          Create an object that implement Vehicle interface and all the methods
         */

        Vehicle vehicle = new NonElectricVehicle();
        vehicle.refuel();

        ElectricVehicle electricVehicle = new ElectricVehicle();
        electricVehicle.refuel();
    }
}
