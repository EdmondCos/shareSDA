package com.sda.serializare;

import java.io.Serializable;

public class Person implements Serializable {
    private String nume;
    private int varsta;
    private transient String cnp;

    public Person(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }
}
