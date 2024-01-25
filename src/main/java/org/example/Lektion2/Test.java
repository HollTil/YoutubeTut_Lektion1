package org.example.Lektion2;

public class Test {
    public static void main(String[] args) {

        Rechteck rechteck1 = new Rechteck();
        rechteck1.breite = 5;
        rechteck1.laenge = 10;

        rechteck1.berechneUmfang();
        rechteck1.printAll();
    }


}
