package Uebung2;

import java.util.Random;
import java.util.Scanner;

public class Wuerfelbecher {
    public static void wurf2() {
        Random rnd = new Random();
        //Scanner sc = new Scanner(System.in);

        int[] rolls = new int[10];

        //int roll;
        //int roll1;
        //int roll2;

        do {
            rolls[0] = rnd.nextInt(10) + 1;
            rolls[1] = rnd.nextInt(6) + 1;
            rolls[3] = rnd.nextInt(8) + 1;
            rolls[2] = rnd.nextInt(100) + 1;

        }while (rolls[2] < 1 || rolls[2] > 100);


        System.out.println("W6 wuerfelt : " + rolls[1]);
        System.out.println("W8 wuerfelt : " + rolls[3]);
        System.out.println("W10 wuerfelt : " + rolls[0]);
        System.out.println("W100 wuerfelt : " + rolls[2]);


    }


}

