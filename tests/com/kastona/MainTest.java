package com.kastona;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void add() {
        Main main = new Main();
        int expected = 2;
        int actual = main.add(1,1);

        assertEquals(expected, actual);
    }


    @Test
    void squareNumber() {
        Main main = new Main();
        int expected =1;
        int actual = main.squareNumber(1);
        assertEquals(expected, actual);
    }

    @Test
    void devide() {
        Main main = new Main();

        assertThrows(ArithmeticException.class, () -> main.devide(1,0), "Method should throw an error for divide by 0");
    }
}