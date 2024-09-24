package fufang.learning.unit.service;

public class Calculator {
    public Integer divide(Integer nominator, Integer denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Can not divide by zero");
        } else {
            return nominator / denominator;
        }
    }

    public Integer add(Integer firstInteger, Integer secondInteger) {
        return firstInteger + secondInteger;
    }

    public Integer sum(Integer... numbers){
        int result = 0;
        for (Integer number: numbers){
            result += number;
        }
        return result;
    }
}
