package basics;

import java.util.Date; // Alles aus anderen Packeges muss Importiert werden
// alles aus java.lang ist immer verfügbar undmuss nicht importiert werden!!
import java.util.*; // wählt alles im Package das importiert wird
public class Datatypetest {

    // end of Line Commentar
    /* Multiline Commentar */

    // Pascalcase = Klassen, Interfacees und Enums
    // camelCase = variablen, Attrbute und Methoden
    // snake_case = wird in java nicht verwendet
    // SCREMING_SNAKE_CASE = Konstenten
    // kleinbuchstaben = packeges

    //de.gfn.video.converter.MP4Converter
    // com.adobe.video.converter.MP4Converter
    private int anzahl; // Eigenschaft, Instanzvariable
     private static int count;// Klassenvariable
    public static void main (String[] args){

        byte i = 100; //primitiv
        StringBuilder sb = new StringBuilder(); //komplex, lokal variable

        Date heute = new Date();

    }

    /** Javadocumentation
     *
     * @param name
     */
    private void machWas(String name){ // Methode


    }
}
