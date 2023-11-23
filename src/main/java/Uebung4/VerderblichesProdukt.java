package Uebung4;

public class VerderblichesProdukt extends Produkt {
    private final String verfallsdatum;

    public VerderblichesProdukt(String wareneingang, String produktname, String preis, String anzahl, String verfallsdatum) {
        super(wareneingang, produktname, preis, anzahl);
        this.verfallsdatum = verfallsdatum;
    }

    public String getVerfallsdatum() {
        return verfallsdatum;
    }
}
