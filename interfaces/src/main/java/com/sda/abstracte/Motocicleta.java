package com.sda.abstracte;

import com.sda.interfete.ICaroserie;

public class Motocicleta extends AMotor implements ICaroserie {

    @Override
    public String getTip() {
        return "Cruiser";
    }

    @Override
    public String getCilindre() {
        return "0.6";
    }
}
