package fufang.learning.stream;

import org.junit.jupiter.api.Test;
import java.util.stream.Stream;

/**
 * This class contains test methods to demonstrate the use of matching operations
 * in Java Streams, such as anyMatch, allMatch, and noneMatch.
 */
public class CheckOperationTest {

    /**
     * Tests whether any element in the stream matches the given predicate.
     * In this case, it checks if any number is greater than 20.
     */
    @Test
    void testAnyMatch() {
        boolean match = Stream.of(1, 2, 3, 4, 5, 21, 6, 7, 8, 9, 10)
                .anyMatch(number -> number > 20);

        System.out.println(match);  // Expected output: true
    }

    /**
     * Tests whether all elements in the stream match the given predicate.
     * In this case, it checks if all numbers are less than 31.
     */
    @Test
    void testAllMatch() {
        boolean match = Stream.of(1, 2, 3, 4, 5, 21, 6, 7, 8, 9, 10)
                .allMatch(number -> number < 31);

        System.out.println(match);  // Expected output: true
    }

    /**
     * Tests whether no elements in the stream match the given predicate.
     * In this case, it checks if none of the numbers are greater than 10.
     */
    @Test
    void testNoneMatch() {
        boolean noneMatch = Stream.of(1, 2, 3, 4, 5, 6)
                .noneMatch(number -> number > 10);

        System.out.println(noneMatch);  // Expected output: true
    }
}
