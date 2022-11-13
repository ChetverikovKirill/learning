package com.learning;

import com.leaning.HelloWorld;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FactorialTest {

    @Test
    public void testRecursive() {
        int actual = HelloWorld.factorialRec(6);
        assertEquals(720, actual);
    }

}
