package fufang.learning.java.oop.source;

public interface Vehicle {
    /**
     * An interface is a completely abstract type in Java, meaning it can only contain abstract methods (before Java 8).
     * However, in newer versions of Java (8 and beyond), interfaces can also have default methods and static methods.
     * Interfaces are used to define a contract that classes must follow.
     * Used to define a contract for classes
     */
    // Abstract method
    void sound();

    // Default method (Java 8 and later)
    void refuel();

}
