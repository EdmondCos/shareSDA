package com.sda.unitTest;

import org.junit.Test;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;


public class ArrayTest {

    String[] target = {"Ionel", "Dorel", "Fanel", "Gigel"};

    @Test
    public void size() {
        assertEquals(4, target.length);
    }

    @Test
    public void isDorel() {
        boolean is = false;
        for (String i : target) {
            if (i.equals("Dorel")) {
                is = true;
            }
        }
        assertTrue(is);
    }

    @Test
    public void isIon() {
        boolean is = false;
        for (String i : target) {
            if (i.equals("Ion")) {
                is = true;
            }
        }
        assertFalse(is);
    }

    @Test
    public void isIonStream() {
        boolean is = false;
        if (Stream.of(target).anyMatch(item -> item.equals("Ion"))) {
            is = true;
        }
        assertFalse(is);
    }

    @Test
    public void testArrayWithAssertJ() {
        assertThat(target)
                .hasSize(4)
                .contains("Dorel")
                .doesNotContain("Ion");
    }

}