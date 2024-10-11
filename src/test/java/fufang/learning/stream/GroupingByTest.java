package fufang.learning.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This class demonstrates the usage of groupingBy and partitioningBy collectors on streams.
 */
public class GroupingByTest {
    private final Integer[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private final Character[] characters = {'a', 'b', 'c', 'd', 'e'};

    /**
     * Test to group numbers as odd or even.
     */
    @Test
    void testGroupingByOddEvenNumber() {
        Map<String, List<Integer>> result = Stream.of(numbers)
                .collect(Collectors.groupingBy(number -> number % 2 == 0 ? "Even" : "Odd"));
        System.out.println(result);
    }

    /**
     * Test to partition numbers based on whether they are greater than 5.
     */
    @Test
    void testPartitioningBy() {
        Map<Boolean, List<Integer>> result = Stream.of(numbers)
                .collect(Collectors.partitioningBy(number -> number > 5));
        System.out.println(result);
    }

    /**
     * Test to group characters as vowels or consonants.
     */
    @Test
    void testGroupingByVowelConsonant() {
        Map<String, List<Character>> result = Stream.of(characters)
                .collect(Collectors.groupingBy(character ->
                        "aeiou".indexOf(character) >= 0 ? "Vowel" : "Consonant"));
        System.out.println(result);
    }
}
