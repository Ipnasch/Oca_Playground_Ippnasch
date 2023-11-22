package Uebung7;
import java.util.*;

class Termin implements Comparable<Termin> {
    private Date datum;
    private String uhrzeit;
    private String titel;
    private String beschreibung;

    public Termin(Date datum, String uhrzeit, String titel, String beschreibung) {
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.titel = titel;
        this.beschreibung = beschreibung;
    }

    public Date getDatum() {
        return datum;
    }

    public String getUhrzeit() {
        return uhrzeit;
    }

    public String getTitel() {
        return titel;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    @Override
    public int compareTo(Termin termin) {
        return this.datum.compareTo(termin.getDatum());
    }
}

/*public class Kalender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Termin> termine = new ArrayList<>();

        while (true) {
            System.out.println("Bitte geben Sie das Datum (dd.MM.yyyy) ein oder 'exit' zum Beenden:");
            String eingabe = scanner.nextLine();

            if (eingabe.equals("exit")) {
                break;
            }

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
}*/
