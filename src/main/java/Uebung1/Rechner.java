package Uebung1;

public class Rechner {
    public static void main(String[] args) {
        Berechnung meinRechner = new Berechnung(10, 0);


        System.out.println("Addition: " + meinRechner.addieren());
        System.out.println("Subtraktion: " + meinRechner.sub());
        System.out.println("Multiplikation: " + meinRechner.multi());
        System.out.println("Division: " + meinRechner.dividieren());

        // Verwendung von Getter und Setter
       meinRechner.setZahl1(5);
        meinRechner.setZahl2(7);

        System.out.println("\nNach Änderung der Zahlen:");
        System.out.println("Zahl 1: " + meinRechner.getZahl1());
        System.out.println("Zahl 2: " + meinRechner.getZahl2());
        System.out.println("Subtraktion: " + meinRechner.sub());
        System.out.println("Addition: " + meinRechner.addieren());
        System.out.println("Multiplikation: " + meinRechner.multi());
        System.out.println("Division: " + meinRechner.dividieren());

    }
}


