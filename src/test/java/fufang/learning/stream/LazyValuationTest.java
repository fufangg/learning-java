package fufang.learning.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

/**
 * This class demonstrates lazy evaluation in Java streams.
 * Intermediate operations are not executed until a terminal operation is called.
 */
public class LazyValuationTest {

    private final List<String> names = List.of("Foo", "Bar", "FooBar");

    /**
     * Test showing that intermediate operations (e.g., map) do not trigger any action on the stream
     * until a terminal operation is invoked. In this case, nothing is printed.
     */
    @Test
    void testIntermediateOperation() {
        // This stream will not be executed until a terminal operation is applied.
        Stream<String> upperStream = names.stream()
                .map(name -> {
                    System.out.println("Change " + name + " to UpperCase");
                    return name.toUpperCase();
                });

        // No output will be seen because there's no terminal operation.
        // The intermediate operation 'map' is lazy.
    }

    /**
     * Test showing that once a terminal operation (e.g., forEach) is called,
     * the intermediate operations (e.g., map) are executed.
     */
    @Test
    void testTerminalOperation() {
        names.stream()
                .map(name -> {
                    System.out.println("Change " + name + " to UpperCase");
                    return name.toUpperCase();
                })
                .forEach(System.out::println); // Terminal operation triggers stream evaluation
    }
}
