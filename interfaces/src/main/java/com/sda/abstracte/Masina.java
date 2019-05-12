package com.sda.abstracte;

import com.sda.abstracte.ACaroserie;
import com.sda.interfete.IMotor;

public class Masina extends ACaroserie implements IMotor {

    @Override
    public String getTip() {
        return "cabrio";
    }

    @Override
    public String getCilindre() {
        return "4.7 Hemi";
    }
}
