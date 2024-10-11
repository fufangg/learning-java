package fufang.learning.unit;

import org.junit.jupiter.api.*;
import org.opentest4j.TestAbortedException;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assumptions.*;

class ConditionTest {

    @Test
    @Disabled
    void disabled(){}

    @Test
    void testAbortedIfNotDev(){
        var profile = System.getenv("PROFILE");
        if(!"DEV".equals(profile)){
            throw new TestAbortedException("Test Aborted, Expected: Dev Environment");
        }
        // test unit for DEV
    }

    @Test
    public void testAbortedWithAssumptions(){
        assumeTrue("DEV".equals(System.getenv("PROFILE")));

        System.out.println(System.getenv("PROFILE"));
        // test unit for DEV
    }

    





}
