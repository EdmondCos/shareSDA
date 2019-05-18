package com.sda.generics;

//T conventie pentru orice tip de date.
public class GenericBox<T> {

    private T t;

    public GenericBox(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
