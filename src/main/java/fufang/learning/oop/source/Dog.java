package fufang.learning.oop.source;

public class Dog extends Animal {
    /**
     * This class is extending an Animal abstract class, so this class should implement the Animal class that having
     * abstract modifier
     */
    @Override
    public void sound() {
        System.out.println("Woof Woof");
    }


    public void sleep() {
        System.out.println("The dog sleep.");
    }
}
