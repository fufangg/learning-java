package fufang.learning.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

/**
 * This class demonstrates various ways to create streams in Java,
 * including empty streams, single-element streams, array streams,
 * collection streams, and infinite streams.
 */
public class CreateStreamTest {

    /**
     * Tests creating an empty stream, a single-element stream,
     * and a stream using Stream.ofNullable() for nullable elements.
     */
    @Test
    void testCreateEmptyOrSingleStream() {
        // Creating an empty stream
        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(data -> {
            System.out.println(data);  // No output expected
        });

        // Creating a stream with a single element
        Stream<String> oneStream = Stream.of("Fufang");
        oneStream.forEach(data -> {
            System.out.println(data);  // Expected output: Fufang
        });

        // Creating a stream that handles nullable elements
        String data = "Yusab";
        Stream<String> emptyOrNotStream = Stream.ofNullable(data);
        emptyOrNotStream.forEach(item -> {
            System.out.println(item);  // Expected output: Yusab
        });
    }

    /**
     * Tests creating streams from arrays.
     * Demonstrates how to create streams from both String and Integer arrays.
     */
    @Test
    void testCreateStreamFromArray() {
        // Creating a stream from a fixed set of elements
        Stream<String> arrayStream = Stream.of("Yusab", "Alwan", "Naufal");
        arrayStream.forEach(name -> System.out.println(name));  // Expected output: Yusab Alwan Naufal

        // Creating a stream of integers
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 5, 6, 7, 8, 9, 10);
        integerStream.forEach(System.out::println);  // Expected output: 1 2 3 5 6 7 8 9 10

        // Creating a stream from an array
        String[] array = new String[]{"Yusab", "Alwan", "Naufal"};
        Stream<String> streamFromArray = Arrays.stream(array);
        streamFromArray.forEach(System.out::println);  // Expected output: Yusab Alwan Naufal
    }

    /**
     * Tests creating a stream from a collection.
     * Demonstrates how to create streams from a List.
     */
    @Test
    void testCreateStreamFromCollection() {
        Collection<String> collection = List.of("Yusab", "Alwan", "Naufal");
        Stream<String> stringStream = collection.stream();
        stringStream.forEach(System.out::println);  // Expected output: Yusab Alwan Naufal

        // Creating another stream from the same collection
        Stream<String> stringStream2 = collection.stream();
        stringStream2.forEach(System.out::println);  // Expected output: Yusab Alwan Naufal
    }

    /**
     * Tests creating infinite streams using Stream.generate() and Stream.iterate().
     * Note: Uncommenting the forEach calls will result in infinite output.
     */
    @Test
    void testCreateInfiniteStream() {
        // Creating an infinite stream of the same string
        Stream<String> stream = Stream.generate(() -> "Yusab Alwan Naufal");
        // stream.forEach(System.out::println);  // Uncommenting will produce infinite output

        // Creating an infinite stream of integers starting from 1
        Stream<Integer> iterate = Stream.iterate(1, value -> value + 1);
        // iterate.forEach(System.out::println);  // Uncommenting will produce infinite output
    }
}
