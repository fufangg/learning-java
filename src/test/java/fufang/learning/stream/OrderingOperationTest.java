package fufang.learning.stream;

import fufang.learning.Data;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class contains tests that verify the sorting operations performed on
 * the string list from the {@link Data} class. It covers natural sorting
 * (lexicographical) and reverse sorting using Java Streams.
 */
public class OrderingOperationTest {

    // An instance of the Data class to access sample data
    Data data = new Data();

    // List of names fetched from the Data class for testing purposes
    List<String> names = data.getStringList();

    /**
     * Test to verify that the string list is correctly sorted in natural order
     * (lexicographical). It uses the {@code sorted()} method on a stream to sort
     * the list and compares the result with the expected sorted list.
     */
    @Test
    void testSorted() {
        // Expected list after natural order sorting
        List<String> expected = List.of("FEIN", "Fufang", "Fufang", "List", "LoSiento");

        // Stream operation to sort the list
        List<String> sorted = names.stream()
                .sorted()
                .toList(); // Convert the stream to a List

        // Assertion to verify the sorted list matches the expected list
        assertEquals(expected, sorted);
    }

    /**
     * Test to verify that the string list is correctly sorted in reverse order.
     * It uses the {@code sorted(Comparator.reverseOrder())} method on a stream to
     * sort the list in reverse lexicographical order and compares the result with
     * the expected reverse sorted list.
     */
    @Test
    void testReverseSorted() {
        // Expected list after reverse order sorting
        List<String> expected = List.of("LoSiento", "List", "Fufang", "Fufang", "FEIN");

        // Stream operation to sort the list in reverse order
        List<String> sorted = names.stream()
                .sorted(Comparator.reverseOrder()) // Reverse the order
                .toList(); // Convert the stream to a List

        // Assertion to verify the reverse sorted list matches the expected list
        assertEquals(expected, sorted);
    }
}
