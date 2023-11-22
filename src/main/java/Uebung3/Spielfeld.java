package Uebung3;

public class Spielfeld {
    public static void main(String[] args) {

        System.out.println("Hallo Robofans" );

       String [][] a = new String[10][10];

       for (int i = 0; i < a.length;i++){
           for(int j = 0; j < a[i].length; j++){
               a[i][j] = "_" ;
               System.out.print(a[i][j] + "  ");

           }
           System.out.println();

       }
        System.out.println("Hallo Robofans" );
        int zeile = 6; // Index der Zeile (da Arrays bei 0 beginnen)
        int spalte = 6; // Index der Spalte (da Arrays bei 0 beginnen)
        a[zeile][spalte] = "R";

        for (int i = 0; i < a.length;i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] +  "  ");
            }
            System.out.println();
        }

    }

}
