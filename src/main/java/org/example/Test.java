package org.example;

public class Test {
    public static void main(String[] args) {

        // ein Object "tier1" erstellen:
        Tier tier1 = new Tier();
        tier1.gewicht = 50;
        tier1.name = "Löwe";

        Tier tier2 = new Tier();
        tier2.gewicht = 150;
        tier2.name = "Krokodil";

        System.out.println("Das Tier " +tier1.name+ " wiegt " +tier1.gewicht+ " kg.");
        System.out.println("-------------------------------------------------------");
        System.out.println("Das Tier " +tier2.name+ " wiegt " +tier2.gewicht+ " kg.");
    }
}
