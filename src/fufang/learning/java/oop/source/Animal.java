package fufang.learning.java.oop.source;

abstract class Animal {
    /**
     * An abstract class is a class that cannot be instantiated (you cannot create objects from it).
     * It is meant to be extended by other classes. Abstract classes can have both abstract methods (methods without a body)
     * and concrete methods (methods with a body).
     * Can have abstract methods (methods without implementation) and concrete methods (methods with implementation).
     * Used to represent a general concept (like a blueprint) that other classes can extend.
     * Allows code reusability for common functionality.
     * Cannot be instantiated directly.
     * Used when classes share common behaviour
     */

    // Abstract method (no implementation)
    public abstract void sound();

    // Concrete method (has implementation)
    public void sleep() {
        System.out.println("The animal is sleeping.");
    }
}
