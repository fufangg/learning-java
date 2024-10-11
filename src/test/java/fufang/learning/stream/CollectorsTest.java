package fufang.learning.stream;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This class contains test methods that demonstrate how to use Java Stream API
 * with Collectors to convert streams into different collection types such as Set,
 * List, and Map.
 */
public class CollectorsTest {

    /**
     * Provides a stream of strings.
     *
     * @return a stream of names.
     */
    private Stream<String> getStringStream(){
        return Stream.of("Yusab", "Alwan", "Naufal");
    }

    /**
     * Tests converting a stream into different collection types (Set, List,
     * unmodifiable Set, unmodifiable List) and prints the results.
     */
    @Test
    void testCollectionConverter() {
        // Convert to Set
        Set<String> set = getStringStream().map(String::toUpperCase).collect(Collectors.toSet());

        // Convert to unmodifiable Set
        Set<String> immutableSet = getStringStream().collect(Collectors.toUnmodifiableSet());

        // Convert to List
        List<String> list = getStringStream().toList();

        // Convert to unmodifiable List
        List<String> immutableList = getStringStream().map(String::toLowerCase).collect(Collectors.toUnmodifiableList());

        // Print results
        System.out.println("Set: " + set);
        System.out.println("Immutable Set: " + immutableSet);
        System.out.println("List: " + list);
        System.out.println("Immutable List: " + immutableList);
    }

    /**
     * Tests converting a stream into a Map with UUID keys and name values and prints the result.
     */
    @Test
    void testMapConverter() {
        // Convert to Map with UUID keys
        Map<UUID, String> map = getStringStream().collect(Collectors.toMap(
                id -> UUID.randomUUID(),
                name -> name
        ));

        // Print the map
        System.out.println(map);
    }
}
