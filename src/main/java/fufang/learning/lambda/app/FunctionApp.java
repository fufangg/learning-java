package fufang.learning.lambda.app;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {

//    Function<String, Integer> function = new Function<String, Integer>() {
//        @Override
//        public Integer apply(String s) {
//            return s.length();
//        }
//    };

//        Function<String, Integer> function = value -> value.length();
        Function<String, Integer> function = String::length;

        System.out.println(function.apply("Fufang"));

    }
}
