package Uebung4;

import java.util.Scanner;



public class Lager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wie viele Produkte möchten Sie eingeben?");
        int anzahlProdukte = sc.nextInt();
        sc.nextLine(); // Um den Zeilenumbruch nach der vorherigen Zahl einzulesen

        Produkt[] produkte = new Produkt[anzahlProdukte];

        for (int i = 0; i < anzahlProdukte; i++) {
            System.out.println("Bitte geben Sie den Wareneingang " + (i + 1) + " ein: ");
            String wareneingang = sc.nextLine();

            System.out.println("Bitte geben Sie den Produktnamen " + (i + 1) + " ein: ");
            String produktname = sc.nextLine();

            System.out.println("Bitte geben Sie den Preis " + (i + 1) + " ein:");
            String preis = sc.nextLine();

            System.out.println("Bitte geben Sie die Stueckzahl " + (i + 1) + " ein:");
            String anzahl = sc.nextLine();

            produkte[i] = new Produkt(wareneingang, produktname, preis, anzahl);
        }

        // Anzeigen der eingegebenen Personen
        System.out.println("Eingegebene Produkte:");
        for (Produkt produkt : produkte) {
            System.out.println("Wareneingang: " + produkt.getWareneingang());
            System.out.println("Produktname: " + produkt.getProduktname());
            System.out.println("Preis: " + produkt.getPreis());
            System.out.println("Stueckzahl: " + produkt.getAnzahl());
            System.out.println("---------------------------");
        }
    }
}