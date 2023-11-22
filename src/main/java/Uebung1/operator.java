package Uebung1;

public class operator {

    public int Addition;
    public int Sub;
    public int Multi;
    public double Div;

    public int getAddition() {

        return Addition;
    }

    public void setAddition(int  Zahl1, int Zahl2) {

        Addition = Zahl1 + Zahl2;
    }

    public int getSub() {

        return Sub;
    }

    public void setSub(int  Zahl1, int Zahl2) {

        Sub = Zahl1 - Zahl2;
    }

    public int getMulti() {

        return Multi;
    }

    public void setMulti(int  Zahl1, int Zahl2) {

        Multi = Zahl1 * Zahl2;
    }

    public double getDiv() {

        return Div;
    }

    public void setDivision(double Zahl1, double Zahl2) {

        Div = Zahl1 / Zahl2;
    }
}
