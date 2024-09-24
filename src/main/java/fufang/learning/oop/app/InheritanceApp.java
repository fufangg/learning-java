package fufang.learning.oop.app;

import fufang.learning.oop.source.ElectricVehicle;
import fufang.learning.oop.source.NonElectricVehicle;
import fufang.learning.oop.source.Vehicle;

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
