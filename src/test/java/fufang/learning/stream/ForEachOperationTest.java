package fufang.learning.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

/**
 * This class demonstrates the use of the forEach() and peek() operations on streams in Java.
 * It showcases how to inspect elements at various stages of the stream pipeline.
 */
public class ForEachOperationTest {

    /**
     * Test using map() for transformation with logging before and after the change.
     */
    @Test
    void testTransformationWithMap() {
        Stream.of("Yusab", "Alwan", "Naufal", "Fufang", "Fufang")
                .map(name -> {
                    System.out.println("Before Change Name to Upper : " + name);
                    String upper = name.toUpperCase();
                    System.out.println("Change Name to Upper : " + upper);
                    return upper;
                })
                .forEach(name -> System.out.println("Final Name : " + name));
    }

    /**
     * Test using peek() to inspect values at different stages without modifying the data.
     */
    @Test
    void testInspectionWithPeek(){
        Stream.of("Yusab", "Alwan", "Naufal", "Fufang", "Fufang")
                .peek(name -> System.out.println("Inspecting: " + name))
                .map(String::toUpperCase)
                .peek(upper -> System.out.println("Change Name to Upper : " + upper))
                .forEach(name -> System.out.println("Final Name : " + name));

    }
}
