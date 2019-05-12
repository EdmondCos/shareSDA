package com.sda.interfete;

public class Motocicleta implements IMotor, ICaroserie {

    @Override
    public String getTip() {
        return "Cruiser";
    }

    @Override
    public String getCilindre() {
        return "0.6";
    }
}
