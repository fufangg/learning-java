package fufang.learning.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class CheckOperationTest {
    @Test
    void testAnyMatch() {
        boolean match = Stream.of(1, 2, 3, 4, 5, 21, 6, 7, 8, 9, 10)
                .anyMatch(number -> number > 20);

        System.out.println(match);
    }

    @Test
    void testAllMatch() {
        boolean match = Stream.of(1, 2, 3, 4, 5, 21, 6, 7, 8, 9, 10)
                .allMatch(number -> number <31);

        System.out.println(match);
    }

    @Test
    void testNoneMatch(){
        boolean noneMatch = Stream.of(1,2,3,4,5,6)
                .noneMatch(number -> number > 10);

        System.out.println(noneMatch);
    }
}
