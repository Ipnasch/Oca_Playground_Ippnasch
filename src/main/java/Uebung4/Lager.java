package Uebung4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Die Hauptklasse für die Benutzerinteraktion und Produktverwaltung
public class Lager {
    //private static String Lagerbestand;
    private static final String DATEI_NAME = "produkte.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Laden der Produkte aus der Datei (falls vorhanden)
        List<Produkt> produkte = ladeProdukte();

        System.out.println("Wie viele Produkte möchten Sie eingeben?");
        int anzahlProdukte = sc.nextInt();
        sc.nextLine(); // Um den Zeilenumbruch nach der vorherigen Zahl einzulesen

       // Produkt[] produkte = new Produkt[anzahlProdukte];

        for (int i = 0; i < anzahlProdukte; i++) {
            System.out.println("Welchen Produkttyp möchten Sie eingeben? (1 für normales Produkt, 2 für verderbliches Produkt)");
            int produktTyp = sc.nextInt(); //neu
            sc.nextLine(); // Um den Zeilenumbruch nach der vorherigen Zahl einzulesen

            System.out.println("Bitte geben Sie den Wareneingang " + (i + 1) + " ein: ");
            String wareneingang = sc.nextLine();

            System.out.println("Bitte geben Sie den Produktnamen " + (i + 1) + " ein: ");
            String produktname = sc.nextLine();

            System.out.println("Bitte geben Sie den Preis " + (i + 1) + " ein:");
            String preis = sc.nextLine();

            System.out.println("Bitte geben Sie die Stueckzahl " + (i + 1) + " ein:");
            String anzahl = sc.nextLine();
                            //neu
            if (produktTyp == 1) {
                produkte.add(new Produkt(wareneingang, produktname, preis, anzahl));
            } else if (produktTyp == 2) {
                System.out.println("Bitte geben Sie das Verfallsdatum für das verderbliche Produkt " + (i + 1) + " ein:");
                String verfallsdatum = sc.nextLine();
                produkte.add(new VerderblichesProdukt(wareneingang, produktname, preis, anzahl, verfallsdatum));
            } else {
                System.out.println("Ungültige Auswahl. Bitte 1 für normales Produkt oder 2 für verderbliches Produkt eingeben.");
                i--; // Zurücksetzen, um die Eingabe für das aktuelle Produkt erneut zu ermöglichen
            }
            speichereProdukte(produkte);
        }
        // Anzeigen der eingegebenen Produkte
        System.out.println("Eingegebene Produkte:");
        for (Produkt produkt : produkte) {
            System.out.println("Wareneingang: " + produkt.getWareneingang());
            System.out.println("Produktname: " + produkt.getProduktname());
            System.out.println("Preis: " + produkt.getPreis());
            System.out.println("Stueckzahl: " + produkt.getAnzahl());
                        //abfrage
            if (produkt instanceof VerderblichesProdukt verderblichesProdukt) {
                System.out.println("Verfallsdatum: " + verderblichesProdukt.getVerfallsdatum());
            }
            System.out.println("---------------------------");
        }

    }



    private static List<Produkt> ladeProdukte() {
        List<Produkt> produktListe = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(DATEI_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                //System.out.println("###");
                String[] produktDaten = line.split(";");// Annahme: Trennzeichen zwischen den Daten ist ';'
                //System.out.println(produktDaten.length);
                if (produktDaten.length >= 4) { // Überprüfen, ob genügend Daten vorhanden sind
                    String wareneingang = produktDaten[0];

                    String produktname = produktDaten[1];
                    String preis = produktDaten[2];
                    String anzahl = produktDaten[3];


                    if (produktDaten.length == 4) {

                        produktListe.add(new Produkt(wareneingang, produktname, preis, anzahl));
                    } else if (produktDaten.length == 5) {
                        String verfallsdatum = produktDaten[4]; // Verderbliche Produkte enthalten ein Verfallsdatum

                        produktListe.add(new VerderblichesProdukt(wareneingang, produktname, preis, anzahl, verfallsdatum));
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Fehler beim Laden der Produkte: " + e.getMessage());
        }

        return produktListe;
                
    }
    private static void speichereProdukte(List<Produkt> produkte) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(DATEI_NAME))) {
            for (Produkt produkt : produkte) {
                if (produkt instanceof VerderblichesProdukt) {
                    VerderblichesProdukt verderblichesProdukt = (VerderblichesProdukt) produkt;
                    bw.write(verderblichesProdukt.getWareneingang() + ";" +
                            verderblichesProdukt.getProduktname() + ";" +
                            verderblichesProdukt.getPreis() + ";" +
                            verderblichesProdukt.getAnzahl() + ";" +
                            verderblichesProdukt.getVerfallsdatum());
                } else {
                    bw.write(produkt.getWareneingang() + ";" +
                            produkt.getProduktname() + ";" +
                            produkt.getPreis() + ";" +
                            produkt.getAnzahl());
                }
                bw.newLine();

            }
        } catch (IOException e) {
            System.err.println("Fehler beim Speichern der Produkte: " + e.getMessage());
        }
    }
}
