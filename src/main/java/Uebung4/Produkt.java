package Uebung4;
public class Produkt {
    private final String wareneingang;
    private final String produktname;
    private final String preis;
    private final String anzahl;

    public Produkt(String wareneingang, String produktname, String preis, String anzahl) {
        this.produktname = produktname;
        this.preis = preis;
        this.anzahl = anzahl;
        this.wareneingang = wareneingang;
    }
    public String getWareneingang() {
        return wareneingang;
    }
    public String getProduktname() {
        return produktname;
    }
    public String getPreis() {
        return preis;
    }
    public String getAnzahl() {
        return anzahl;
    }

}

