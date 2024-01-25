package org.example.Lektion2;

public class Rechteck {
    int laenge, breite;
    int umfang = 0;
    public void berechneUmfang(){
        umfang = breite * 2 + laenge * 2;
    }

    void printAll(){
        System.out.println("Länge: " + laenge);
        System.out.println("Breite: " + breite);
        System.out.println("Umfang: " + umfang);

    }
}
