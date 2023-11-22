package Uebung7;

import java.text.SimpleDateFormat;
import java.util.*;
// localdate format ist aktueller

public class Kalender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Termin> termine = new ArrayList<>();

        while (true) {
            System.out.println("Bitte geben Sie das Datum (dd.MM.yyyy) ein oder 'exit' zum Beenden:");
            String eingabe = scanner.nextLine();

            if (eingabe.equals("exit")) {
                break;
            }//hallo
            //test

            try {
                System.out.println("Bitte geben Sie die Uhrzeit (hh:mm) ein:");
                String uhrzeit = scanner.nextLine();

                System.out.println("Bitte geben Sie den Titel ein:");
                String titel = scanner.nextLine();

                System.out.println("Bitte geben Sie eine Beschreibung ein:");
                String beschreibung = scanner.nextLine();

                Date datum = new SimpleDateFormat("dd.MM.yyyy").parse(eingabe);
                termine.add(new Termin(datum, uhrzeit, titel, beschreibung));

                Collections.sort(termine);
            } catch (Exception e) {
                System.out.println("Ungültiges Datum. Bitte versuchen Sie es erneut.");
            }
        }

        System.out.println("Alle Termine:");
        for (Termin termin : termine) {
            System.out.println("Datum: " + termin.getDatum() + ", Uhrzeit: " + termin.getUhrzeit() +
                    ", Titel: " + termin.getTitel() + ", Beschreibung: " + termin.getBeschreibung());
        }

        // Erweiterung 1: Ausgabe für einen bestimmten Tag
        System.out.println("Bitte geben Sie ein Datum (dd.MM.yyyy) für die Terminausgabe ein:");
        String datumEingabe = scanner.nextLine();
        try {
            Date gesuchtesDatum = new SimpleDateFormat("dd.MM.yyyy").parse(datumEingabe);
            System.out.println("Termine für den " + datumEingabe + ":");
            for (Termin termin : termine) {
                if (termin.getDatum().equals(gesuchtesDatum)) {
                    System.out.println("Uhrzeit: " + termin.getUhrzeit() +
                            ", Titel: " + termin.getTitel() + ", Beschreibung: " + termin.getBeschreibung());
                }
            }
        } catch (Exception e) {
            System.out.println("Ungültiges Datum. Bitte versuchen Sie es erneut.");
        }

        scanner.close();
    }
}
