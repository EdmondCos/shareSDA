package com.sda.interfete;
//Key word IMPLEMENTS poate implementa mai multe interfete

public class Masina implements ICaroserie, IMotor {

    @Override
    public String getTip() {
        return "Berlina";
    }

    @Override
    public String getCilindre() {
        return "1.2";
    }
}
