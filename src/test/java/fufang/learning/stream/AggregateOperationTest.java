package fufang.learning.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class AggregateOperationTest {


    List<Integer> integers(){
        return List.of(1,2,3,4,5,6,7,8,9,10);
    }

    @Test
    void maxTest(){
        integers().stream().max(Comparator.naturalOrder()).ifPresent(System.out::println);
    }

    @Test
    void minTest(){
        integers().stream().min(Comparator.naturalOrder()).ifPresent(System.out::println);
    }

    @Test
    void countTest(){
        long count = integers().stream().count();
        System.out.println(count);
    }

    @Test
    void sumTest(){
//        Integer result = integers().stream()
//                .reduce(0, (value, number) -> value + number);
        Integer result = integers().stream()
                .reduce(0, Integer::sum);
        System.out.println(result);
    }

    @Test
    void factorialTest(){
        Integer result = integers()
                .stream().reduce(1, (value, number) -> value*number);
        System.out.println(result);
    }
}
