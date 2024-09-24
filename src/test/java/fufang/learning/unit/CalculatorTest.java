package fufang.learning.unit;

import fufang.learning.unit.service.Calculator;
import org.junit.jupiter.api.*;
import fufang.learning.unit.generator.SimpleDisplayNameGenerator;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testSumSuccess(){
        Integer expected = 20;
        Integer result = calculator.sum(1,5,4,5,6,-1);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testDivideSuccess(){
        Integer expected = 5;
        Integer result = calculator.divide(20,4);
        assertSame(expected, result);
        assertEquals(expected, result);
        System.out.println(expected.getClass());
        System.out.println(expected.equals(result));
    }

    @Test
    void testDivideFailed(){
        assertThrows(IllegalArgumentException.class, ()-> calculator.divide(10,0));
    }
}
