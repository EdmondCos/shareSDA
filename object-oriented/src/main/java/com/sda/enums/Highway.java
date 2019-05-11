package com.sda.enums;

public class Highway {
    private LenghtUnit unit;
    private int length;

    public Highway(LenghtUnit unit, int length) {
        this.unit = unit;
        this.length = length;
    }

    public LenghtUnit getUnit() {
        return unit;
    }

    public int getLength() {
        return length;
    }
}
