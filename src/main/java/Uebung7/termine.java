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



