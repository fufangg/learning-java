package fufang.learning.unit.generator;

import org.junit.jupiter.api.DisplayNameGenerator;

import java.lang.reflect.Method;

public class SimpleDisplayNameGenerator implements DisplayNameGenerator {

    @Override
    public String generateDisplayNameForClass(Class<?> testClass) {
        return testClass.getSimpleName();
    }

    @Override
    public String generateDisplayNameForNestedClass(Class<?> nestedClass) {
        return "";
    }

    @Override
    public String generateDisplayNameForMethod(Class<?> testClass, Method testMethod) {
        return testMethod.getName();
    }
}
