package com.kastona;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    Factorial ob;
    @BeforeEach
    public void init() {
        ob = new Factorial();
    }

    @Test
    void factorial() {
        int expected = 1;
        int actual = ob.factorial(0);

        assertEquals(expected, actual, "zero must return 1");
    }
}