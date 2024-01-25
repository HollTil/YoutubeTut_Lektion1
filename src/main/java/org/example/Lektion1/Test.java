package org.example.Lektion1;

public class Test {
    public static void main(String[] args) {

        // ein Object "tier1" erstellen:
        Tier tier1 = new Tier();
        tier1.gewicht = 50;
        tier1.name = "Löwe";
        // ein Object "tier2" erstellen:
        Tier tier2 = new Tier();
        tier2.gewicht = 150;
        tier2.name = "Krokodil";
        System.out.println("-------------------------------------------------------");
        System.out.println("Das Tier " +tier1.name+ " wiegt " +tier1.gewicht+ " kg.");
        System.out.println("-------------------------------------------------------");
        System.out.println("Das Tier " +tier2.name+ " wiegt " +tier2.gewicht+ " kg.");
        System.out.println("-------------------------------------------------------");
        // ein Object "mensch1" erstellen:
        Mensch mensch1 = new Mensch();
        mensch1.name ="Rüdiger";
        mensch1.alter = 44;

        System.out.println( mensch1.name + " ist ein Mensch und ist " + mensch1.alter + " Jahre alt");
        System.out.println("-------------------------------------------------------");
    }
}
