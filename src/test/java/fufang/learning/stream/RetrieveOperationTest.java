package fufang.learning.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * This class demonstrates retrieval operations on streams in Java.
 * It includes tests for limiting, skipping, and finding elements in a stream.
 */
public class RetrieveOperationTest {

    /**
     * Tests limiting the number of elements from a stream of strings.
     * It prints the first two names from the list.
     */
    @Test
    void testLimit() {
        List.of("Yusab", "Alwan", "Naufal", "Yusuf", "Hafid", "Ahmad", "Yafi").stream()
                .limit(2)
                .forEach(System.out::println);
    }

    /**
     * Tests skipping a specified number of elements in a stream of strings.
     * It prints all names after skipping the first two.
     */
    @Test
    void testSkip() {
        List.of("Yusab", "Alwan", "Naufal", "Yusuf", "Hafid", "Ahmad", "Yafi").stream()
                .skip(2)
                .forEach(System.out::println);
    }

    /**
     * Tests taking elements from a stream of strings while a condition is met.
     * It prints names with a length of 4 or less.
     */
    @Test
    void testTakeWhile() {
        List.of("Yusab", "Alwan", "Naufal", "Yusuf", "Hafid", "Ahmad", "Yafi").stream()
                .takeWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    /**
     * Tests dropping elements from a stream of strings while a condition is met.
     * It prints names with a length greater than 4.
     */
    @Test
    void testDropWhile() {
        List.of("Yusab", "Alwan", "Naufal", "Yusuf", "Hafid", "Ahmad", "Yafi").stream()
                .dropWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    /**
     * Tests finding any element in a stream of strings.
     * It prints the found name if present.
     */
    @Test
    void testFindAny() {
        Optional<String> optional = List.of("Yusab", "Alwan", "Naufal", "Yusuf", "Hafid", "Ahmad", "Yafi").stream()
                .findAny();

        optional.ifPresent(System.out::println);
    }

    /**
     * Tests finding the first element in a stream of strings.
     * It prints the first name if present.
     */
    @Test
    void testFindFirst() {
        Optional<String> optional = List.of("Yusab", "Alwan", "Naufal", "Yusuf", "Hafid", "Ahmad", "Yafi").stream()
                .findFirst();

        optional.ifPresent(System.out::println);
    }
}
