package com.sda;

import com.sda.abstracte.Masina;
import com.sda.abstracte.Motocicleta;

public class Main {
    public static void main(String[] args) {

        Masina masinaDinAbstracte=new Masina();
        com.sda.interfete.Masina masinaDinInterfete= new com.sda.interfete.Masina();

        Motocicleta motocicleta=new Motocicleta();

        assert ("Choper").equals(motocicleta.getTip());
    }
}
