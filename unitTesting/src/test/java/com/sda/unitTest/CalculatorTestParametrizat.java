package com.sda.unitTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


/*
Anotarea "@RunWith" indica faptul ca aceasta clasa test se va rula cu un runner specific(Parameterized.class)
*/
@RunWith(Parameterized.class)
public class CalculatorTestParametrizat {

    /*
    Pentru fiecare parametru care va fi preluat dintr-un array imput , se salveaza valoarea si se foloseste in metodea test
    Mecanism obtinut cu anotarea "@Parameterized.Parameter(<indexul din arrayul imput>)
    */
    @Parameterized.Parameter(0)
    public int parametru1;
    @Parameterized.Parameter(1)
    public int parametru2;
    @Parameterized.Parameter(2)
    public int parametru3;

    /*
    Avem nevoie de o metoda publica si statica care intoarce o colectie de arrays
    Metoda e statica pt a nu depinde de clasa test
    Anotăm cu "@Parameterized.Parameters", astfel indicam si runnerului ca e sursa de date, pt parametrii de mai sus.
     */
    @Parameterized.Parameters
    public static Collection<Integer[]> initializedInputParameters() {
        return Arrays.asList(
                new Integer[][]{
                        {1, 2, 3},
                        {2, 3, 5},
                        {1, 1, 3},
                        {123, 698, 821},
                        {1000, 2500, 3500},
                        {50_123, 50_698, 100_821}
                });
    }

    private Calculator target = new Calculator(0, 0);

    @Test
    public void aduna() {
        assertEquals(parametru3, target.aduna(parametru1, parametru2));
    }
}