package fufang.learning.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class RetrieveOperationTest {
    @Test
    void findAnyTest(){
        Optional<String> optional = Stream.of("Bar", "Bar", "Foo")
                .findAny();

        System.out.println(optional);
    }
}
