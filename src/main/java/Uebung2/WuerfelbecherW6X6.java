package Uebung2;

import java.util.Random;
import java.util.Scanner;

public class WuerfelbecherW6X6 {
    public static void wurf() {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("gebe anzahl der wuerfel ein: " );
        int anzahlWuerfel  = sc.nextInt();

        System.out.println("gebe anzahl der seiten ein: " );
        int anzahlSeiten = sc.nextInt();


        int[] rolls = new int[anzahlWuerfel]; // Array für die Würfelergebnisse von x Wx

        for (int i = 0; i < anzahlWuerfel; i++) {
            rolls[i] = rnd.nextInt(anzahlSeiten) + 1; // Wx würfeln und das Ergebnis in das Array einfügen
        }

        // Anzahl der Würfel
        for (int i = 0; i < anzahlWuerfel; i++) {
            System.out.println("W" + anzahlSeiten  +" Wuerfelnr "+ + (i+1) + " wuerfelt : " + rolls[i]);
        }
    }
}
