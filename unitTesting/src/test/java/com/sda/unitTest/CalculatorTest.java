package com.sda.unitTest;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator target = new Calculator(10, 5);

    @Ignore("Motivul pt care ignor testul")
    @Test
    public void testAssert() {
        assertEquals("numerele primite nu sunt ok", "5", "5");
        boolean isValid = false;
//        assertTrue("Raspuns incorect",isValid);
        assertFalse(isValid);
        String nume = null;
        assertNull(nume);
        assertNotNull(nume);
    }

    @Test
    public void aduna() {
        assertEquals(15, target.aduna());
    }

    @Test
    public void aduna1() {
        assertEquals(10, target.aduna(3, 7));
    }

    @Test(timeout = 3000)
    public void testTimeout() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(expected = ArithmeticException.class)
    public void testImpartire() {
        assertEquals(2, target.imparte(4, 2));
        target.imparte(10, 0);
    }
}