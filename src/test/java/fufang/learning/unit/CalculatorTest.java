package fufang.learning.unit;

import fufang.learning.unit.service.Calculator;
import org.junit.jupiter.api.*;
import fufang.learning.unit.generator.SimpleDisplayNameGenerator;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
class CalculatorTest {

    /**
     * Setup method to initialize the Calculator object before each test.
     * This ensures a fresh instance of Calculator is available for each test case.
     */
    private final Calculator calculator = new Calculator();

        /**
         * Tests the addition of two positive integers.
         * The result should be the sum of the two numbers.
         */
        @Test
        void testAddition_positiveNumbers() {
            int result = calculator.add(10, 20);
            assertEquals(30, result, "10 + 20 should equal 30");
        }

        /**
         * Tests the addition of two negative integers.
         * The result should be the sum of the two negative numbers.
         */
        @Test
        void testAddition_negativeNumbers() {
            int result = calculator.add(-10, -5);
            assertEquals(-15, result, "-10 + -5 should equal -15");
        }

        /**
         * Tests the subtraction of two integers.
         * Ensures that the result is the difference between the first and second number.
         */
        @Test
        void testSubtraction() {
            int result = calculator.subtract(20, 10);
            assertEquals(10, result, "20 - 10 should equal 10");
        }

        /**
         * Tests the multiplication of two integers.
         * Ensures that the result is the product of the two numbers.
         */
        @Test
        void testMultiplication() {
            int result = calculator.multiply(5, 4);
            assertEquals(20, result, "5 * 4 should equal 20");
        }

        /**
         * Tests the division of two integers.
         * Ensures that the result is the quotient of the two numbers.
         */
        @Test
        void testDivision() {
            int result = calculator.divide(20, 5);
            assertEquals(4, result, "20 / 5 should equal 4");
        }

        /**
         * Tests the division by zero scenario.
         * Expects an ArithmeticException to be thrown when dividing by zero.
         */
        @Test
        void testDivision_byZero() {
            assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0),
                    "Division by zero should throw ArithmeticException");
        }

        /**
         * Tests that the division of zero by any number returns zero.
         */
        @Test
        void testDivision_zeroDividedByNumber() {
            int result = calculator.divide(0, 10);
            assertEquals(0, result, "0 divided by any number should equal 0");
        }
    }


