package com.sda.statics;

public class Client {

//    static int apartine clasei "Client", nu obiectului
    public static int numarOrdine = 0;
    String nume;

    public Client(String nume) {
        this.nume = nume;
        numarOrdine++;
    }

    public static void cresteNumarOrdine(){
        numarOrdine++;
    }
}
