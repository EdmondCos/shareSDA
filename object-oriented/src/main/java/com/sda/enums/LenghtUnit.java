package com.sda.enums;

// Tip referinta specific care accepta o lista predefinita de valori
public enum LenghtUnit {
    CENTIMETER(0.0001),
    DECIMETER(0.01),
    METER(0.001),
    KILOMETER(1);

    double modifier;

    LenghtUnit(double modifier) {
        this.modifier = modifier;
    }
}
