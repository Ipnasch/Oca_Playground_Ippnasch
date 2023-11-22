package Uebung7;
import java.util.Calendar;

public class SimpleCalendar {

    public static void main(String[] args) {
        int year = 2022; // Jahr einstellen
        int month = 10; // Monat einstellen (Januar = 0, Februar = 1, usw.)
        printCalendar(year, month);



    }

    public static void printCalendar(int year, int month) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, 1);

        int numOfDaysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        int startDay = cal.get(Calendar.DAY_OF_WEEK);

        String[] months ={"Jan", "Feb", "Maerz", "Apr", " Mai", "Jun", "Jul", "Aug", "Sep", "okt", "Nov", "Dez"};

        System.out.println(months[month]);
        System.out.println(year + 1);


        System.out.println(" Mo  Di  Mi  Do  Fr  Sa  So");

        int i;
        for (i = 1; i < startDay; i++) {
            System.out.print("    ");
        }

        for (i = 1; i <= numOfDaysInMonth; i++) {
            System.out.printf("%3d", i);

            if (((i + startDay - 1) % 7 == 0) || (i == numOfDaysInMonth)) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }
}

