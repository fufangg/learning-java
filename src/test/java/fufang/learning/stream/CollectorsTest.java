package fufang.learning.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsTest {

    @org.jetbrains.annotations.NotNull
    @org.jetbrains.annotations.Contract(pure = true)
    private Stream<String> getStringStream(){
        return Stream.of("Yusab", "Alwan", "Naufal");
    }

    @Test
    void collectionConverterTest(){
        // to Set
        Set<String> set = getStringStream().map(String::toUpperCase).collect(Collectors.toSet());

        // to unmodifiable Set
        Set<String> immutableSet = getStringStream().collect(Collectors.toUnmodifiableSet());

        // to List
        List<String> list = getStringStream().toList();

        // to unmodifiable List
        List<String> immutableList = getStringStream().map(String::toLowerCase).collect(Collectors.toUnmodifiableList());


        System.out.println("Set: "+set);
        System.out.println("Immutable Set: "+immutableSet);
        System.out.println("List: "+list);
        System.out.println("Immutable List: "+immutableList);
    }

    @Test
    void mapConverterTest(){
        // to Map
        Map<UUID, String> map = getStringStream().collect(Collectors.toMap(
                id -> UUID.randomUUID(),
                name -> name
        ));
        System.out.println(map);
    }
}
