package basics;

public class UserTest {
    public static void main(String[] args){ //einstiegpunkt für das Programm

        User u1 = new User();//objekt wird Instanziert
        u1.firstname = "Peter";
        u1.lastname = "Maier";
        System.out.println(u1.lastname);




    }
    public String/*Rückgabetyp*/ wortErweitern(String/*Eingabetyp*/ wort) {
        wort += " erweitert..." ;
                return wort;
    }


}
