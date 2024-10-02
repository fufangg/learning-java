package fufang.learning.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class ParallelTest {

    Stream<Integer> getStream(){
        return Stream.of(1,2,3,4,5,6,7,8,9,10);
    }
    @Test
    void nonParallelTest(){
        getStream()
                .forEach(number -> System.out.println(
                        Thread.currentThread().getName() + ": " + number
                ));
    }

    @Test
    void parallelTest(){
        getStream()
                .parallel()
                .forEach(number -> System.out.println(
                        Thread.currentThread().getName() + ": " + number
                ));
    }


}
