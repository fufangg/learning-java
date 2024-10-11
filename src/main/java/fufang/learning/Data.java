package fufang.learning;

import java.util.List;

public class Data {
    public Data() {
    }

    private final int[] intExample = {0,1,2,3,4,5,6,7,8,9};
    private final String[] stringExample = {"Fufang", "FEIN", "Fufang", "LoSiento"};
    private final Integer[] integersExample = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,-1,-2,-3,-4,-5};
    private final List<Integer> integerList = List.of(10,20,30,40,50,1,2,3,4,5);
    private final List<String> stringList = List.of("Fufang", "FEIN", "Fufang", "LoSiento", "List");

    public int[] getIntExample() {
        return intExample;
    }

    public String[] getStringExample() {
        return stringExample;
    }

    public Integer[] getIntegersExample() {
        return integersExample;
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public List<String> getStringList() {
        return stringList;
    }
}
