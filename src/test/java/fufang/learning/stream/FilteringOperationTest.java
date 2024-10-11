package fufang.learning.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

/**
 * This class demonstrates filtering operations on streams in Java.
 * It includes tests for filtering elements by length and removing duplicates.
 */
public class FilteringOperationTest {

    /**
     * Tests filtering elements in a stream of strings.
     * It prints the names that have a length greater than 6.
     */
    @Test
    void testFilter() {
        Stream.of("Fufang", "Yusab", "Alwan", "Naufal", "Uvuveuweuevwu")
                .filter(name -> name.length() > 6)
                .forEach(System.out::println);
    }

    /**
     * Tests removing duplicates from a stream of strings using distinct().
     * It prints each unique name once, even if it appears multiple times in the original stream.
     */
    @Test
    void testDistinct() {
        Stream.of("Fufang", "Yusab", "Alwan", "Naufal", "Uvuveuweuevwu", "Fufang")
                .distinct()
                .forEach(System.out::println);
    }
}
