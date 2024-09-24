package fufang.learning.unit;

import org.junit.jupiter.api.*;

public class FlowTest {
    // to check the test flow
    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before All");
    }

    @AfterAll
    public static void afterALl(){
        System.out.println("After All");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("Before Each");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("After Each");
    }

    @Test
    void flowTest(){
        System.out.println("Test");
    }

    @Test
    void scFlowTest(){
        System.out.println("Second Test");
    }
}
