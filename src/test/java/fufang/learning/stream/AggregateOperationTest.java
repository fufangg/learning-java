package fufang.learning.stream;

import org.junit.jupiter.api.Test;
import java.util.Comparator;
import java.util.List;

/**
 * This class contains test methods that demonstrate aggregate operations
 * using Java Streams. It showcases various operations such as finding the maximum,
 * minimum, count, sum, and factorial of a list of integers.
 */
public class AggregateOperationTest {

    /**
     * Provides a list of integers from 1 to 10.
     *
     * @return a list of integers.
     */
    List<Integer> integers(){
        return List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    /**
     * Tests the maximum value in the list of integers using a stream.
     * The maximum value is printed if present.
     */
    @Test
    void testMax(){
        integers().stream()
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);  // Expected output: 10
    }

    /**
     * Tests the minimum value in the list of integers using a stream.
     * The minimum value is printed if present.
     */
    @Test
    void testMin(){
        integers().stream()
                .min(Comparator.naturalOrder())
                .ifPresent(System.out::println);  // Expected output: 1
    }

    /**
     * Tests the count operation on the list of integers using a stream.
     * The total count of the elements is printed.
     */
    @Test
    void testCount(){
        long count = integers().stream().count();
        System.out.println(count);  // Expected output: 10
    }

    /**
     * Tests the sum operation on the list of integers using a stream.
     * The sum of all the integers is calculated and printed.
     */
    @Test
    void testSum(){
        Integer result = integers().stream()
                .reduce(0, Integer::sum);  // Sum all integers in the list
        System.out.println(result);  // Expected output: 55
    }

    /**
     * Tests the factorial operation on the list of integers using a stream.
     * The product of all the integers (factorial-like) is calculated and printed.
     */
    @Test
    void testFactorial(){
        Integer result = integers()
                .stream().reduce(1, (value, number) -> value * number);  // Multiply all integers
        System.out.println(result);  // Expected output: 3,628,800
    }
}
