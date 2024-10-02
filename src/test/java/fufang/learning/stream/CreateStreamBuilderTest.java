package fufang.learning.stream;

import org.junit.jupiter.api.Test;

import java.util.Objects;
import java.util.stream.Stream;

public class CreateStreamBuilderTest {
    @Test
    void createStreamBuilderTest() {

        Stream.Builder<String> builder = Stream.builder();

        // accept method return void
        builder.accept("Yusab");

        // add method return Builder
        builder.add("Alwan").add("Naufal");

        // build method convert from Builder to Stream
        Stream<String> stream = builder.build();
        stream.forEach(name -> System.out.print(name+" "));
    }

    @Test
    void streamBuilderSimplifiedTest(){
        Stream<Object> stream = Stream.builder().add("Yusab").add("Alwan").add("Naufal").build();
        stream.forEach(name -> System.out.print(name+" "));
    }
}
