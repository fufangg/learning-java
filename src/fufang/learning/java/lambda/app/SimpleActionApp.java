package fufang.learning.java.lambda.app;

import fufang.learning.java.lambda.data.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

//        // Basic lambda come from anonymous class
//        SimpleAction simpleAction = new SimpleAction() {
//            @Override
//            public String action() {
//                return "Fufang";
//            }
//        };
//        System.out.println(simpleAction.action());
//
//        // Lambda (first form)
//        SimpleAction simpleAction1 = () -> "Fufang";
//        System.out.println(simpleAction1.action());

        SimpleAction simpleAction = (String value) -> {
            return "Hello " + value;
        };

        SimpleAction simpleAction1 = (name) -> {
            return "Hello " + name;
        };

        SimpleAction simpleAction2 = (String value) -> "Hello " + value;

        SimpleAction simpleAction3 = (value) -> "Hello " + value;

        SimpleAction simpleAction4 = name -> "Hello" + name;


    }
}
