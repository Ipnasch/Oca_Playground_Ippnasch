package Uebung1;

public class Berechnung {


    private double zahl1;
    private double zahl2;

    public Berechnung(double zahl1, double zahl2) {
        this.zahl1 = zahl1;
        this.zahl2 = zahl2;
    }

    public double getZahl1() {
        return zahl1;
    }

    public void setZahl1(double zahl1) {
        this.zahl1 = zahl1;
    }

    public double getZahl2() {
        return zahl2;
    }

    public void setZahl2(double zahl2) {
        this.zahl2 = zahl2;
    }

    public double addieren() {
        return zahl1 + zahl2;
    }

    public double sub() {
        return zahl1 - zahl2;
    }

    public double multi() {
        return zahl1 * zahl2;
    }

    public double dividieren() {
        if (zahl2 != 0) {
            return zahl1 / zahl2;
        } else {
            System.out.println("Ungültige Division durch Null!");
            return Double.NaN; // NaN steht für "Not a Number"
        }
    }
}
