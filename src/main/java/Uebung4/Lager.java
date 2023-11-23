package Uebung4;

import java.util.Scanner;

// Die Hauptklasse für die Benutzerinteraktion und Produktverwaltung
public class Lager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wie viele Produkte möchten Sie eingeben?");
        int anzahlProdukte = sc.nextInt();
        sc.nextLine(); // Um den Zeilenumbruch nach der vorherigen Zahl einzulesen

        Produkt[] produkte = new Produkt[anzahlProdukte];

        for (int i = 0; i < anzahlProdukte; i++) {
            System.out.println("Welchen Produkttyp möchten Sie eingeben? (1 für normales Produkt, 2 für verderbliches Produkt)");
            int produktTyp = sc.nextInt();
            sc.nextLine(); // Um den Zeilenumbruch nach der vorherigen Zahl einzulesen

            System.out.println("Bitte geben Sie den Wareneingang " + (i + 1) + " ein: ");
            String wareneingang = sc.nextLine();

            System.out.println("Bitte geben Sie den Produktnamen " + (i + 1) + " ein: ");
            String produktname = sc.nextLine();

            System.out.println("Bitte geben Sie den Preis " + (i + 1) + " ein:");
            String preis = sc.nextLine();

            System.out.println("Bitte geben Sie die Stueckzahl " + (i + 1) + " ein:");
            String anzahl = sc.nextLine();

            if (produktTyp == 1) {
                produkte[i] = new Produkt(wareneingang, produktname, preis, anzahl);
            } else if (produktTyp == 2) {
                System.out.println("Bitte geben Sie das Verfallsdatum für das verderbliche Produkt " + (i + 1) + " ein:");
                String verfallsdatum = sc.nextLine();
                produkte[i] = new VerderblichesProdukt(wareneingang, produktname, preis, anzahl, verfallsdatum);
            } else {
                System.out.println("Ungültige Auswahl. Bitte 1 für normales Produkt oder 2 für verderbliches Produkt eingeben.");
                i--; // Zurücksetzen, um die Eingabe für das aktuelle Produkt erneut zu ermöglichen
            }
        }

        // Anzeigen der eingegebenen Produkte
        System.out.println("Eingegebene Produkte:");
        for (Produkt produkt : produkte) {
            System.out.println("Wareneingang: " + produkt.getWareneingang());
            System.out.println("Produktname: " + produkt.getProduktname());
            System.out.println("Preis: " + produkt.getPreis());
            System.out.println("Stueckzahl: " + produkt.getAnzahl());

            if (produkt instanceof VerderblichesProdukt verderblichesProdukt) {
                System.out.println("Verfallsdatum: " + verderblichesProdukt.getVerfallsdatum());
            }

            System.out.println("---------------------------");
        }
    }
}
