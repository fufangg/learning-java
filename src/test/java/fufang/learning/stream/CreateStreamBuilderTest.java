package fufang.learning.stream;

import org.junit.jupiter.api.Test;
import java.util.stream.Stream;

/**
 * This class demonstrates how to create and use a Stream Builder in Java Streams.
 * Stream Builders are useful for constructing streams in a controlled manner.
 */
public class CreateStreamBuilderTest {

    /**
     * Tests creating a stream using a Stream Builder.
     * Demonstrates the use of accept, add, and build methods of the Stream Builder.
     */
    @Test
    void testCreateStreamBuilder() {
        Stream.Builder<String> builder = Stream.builder();

        // Using the accept method (returns void)
        builder.accept("Yusab");

        // Using the add method (returns the builder for method chaining)
        builder.add("Alwan").add("Naufal");

        // Building the stream (converts from Builder to Stream)
        Stream<String> stream = builder.build();

        // Printing the names from the stream
        stream.forEach(name -> System.out.print(name + " "));  // Expected output: Yusab Alwan Naufal
    }

    /**
     * Tests creating a stream using a simplified form of the Stream Builder.
     * All elements are added in a single chained statement.
     */
    @Test
    void testStreamBuilderSimplified() {
        Stream<Object> stream = Stream.builder().add("Yusab").add("Alwan").add("Naufal").build();

        // Printing the names from the stream
        stream.forEach(name -> System.out.print(name + " "));  // Expected output: Yusab Alwan Naufal
    }
}
