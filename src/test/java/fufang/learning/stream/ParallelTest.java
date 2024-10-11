package fufang.learning.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

/**
 * This class demonstrates the use of parallel streams in Java.
 * It includes tests for both non-parallel and parallel stream processing.
 */
public class ParallelTest {

    /**
     * Returns a stream of integers from 1 to 10.
     *
     * @return a Stream of integers
     */
    Stream<Integer> getStream() {
        return Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    /**
     * Tests processing a stream in a non-parallel manner.
     * Each number is printed along with the name of the current thread.
     */
    @Test
    void testNonParallel() {
        getStream()
                .forEach(number -> System.out.println(
                        Thread.currentThread().getName() + ": " + number
                ));
    }

    /**
     * Tests processing a stream in parallel.
     * Each number is printed along with the name of the current thread.
     */
    @Test
    void testParallel() {
        getStream()
                .parallel()
                .forEach(number -> System.out.println(
                        Thread.currentThread().getName() + ": " + number
                ));
    }
}
