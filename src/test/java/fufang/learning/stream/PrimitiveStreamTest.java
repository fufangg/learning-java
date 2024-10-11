package fufang.learning.stream;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * This class contains tests that demonstrate the creation and operations
 * of primitive streams in Java, including IntStream, LongStream, and
 * DoubleStream. It showcases various stream operations such as
 * aggregation, mapping, and output.
 */
public class PrimitiveStreamTest {

    /**
     * Test method to create and print primitive streams.
     * Demonstrates how to create IntStream, LongStream, and DoubleStream
     * using different approaches.
     */
    @Test
    void testCreate() {
        System.out.println("IntStream from range 1 to 99:");
        IntStream.range(1, 100)
                .forEach(System.out::println);

        System.out.println("\nLongStream with specific values:");
        LongStream longStream = LongStream.of(1, 2, 3, 4);
        longStream.forEach(System.out::println);

        System.out.println("\nDoubleStream using builder:");
        DoubleStream doubleStream = DoubleStream.builder().add(0.1).add(0.2).build();
        doubleStream.forEach(System.out::println);
    }

    /**
     * Test method to demonstrate operations on IntStream.
     * It calculates the average of numbers from 1 to 99 and prints it.
     * Additionally, it maps the numbers to a formatted string and prints each one.
     */
    @Test
    void testOperations() {
        System.out.println("Calculating average of IntStream:");
        OptionalDouble optionalDouble = IntStream.of(10, 20, 10).average();
        optionalDouble.ifPresent(avg -> System.out.println("Average: " + avg));

        System.out.println("\nMapping numbers to strings:");
        IntStream.range(0, 50)
                .mapToObj(number -> "Number: " + number)
                .forEach(System.out::println);
    }

    /**
     * Test method to demonstrate more operations on IntStream,
     * including filtering, reducing, and collecting.
     */
    @Test
    void testAdvancedOperations() {
        System.out.println("Filtering even numbers and calculating their sum:");

        int sumOfEvens = IntStream.range(1, 100)
                .filter(num -> num % 2 == 0)
                .reduce(0, Integer::sum);
        System.out.println("Sum of even numbers from 1 to 99: " + sumOfEvens);

        System.out.println("\nCollecting squared values into an array:");
        int[] squares = IntStream.range(11, 21)
                .map(num -> num * num)
                .toArray();
        System.out.print("Squares: ");
        for (int square : squares) {
            System.out.print(square + " ");
        }
        System.out.println();
    }
}