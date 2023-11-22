package basics;

public class HashCodeTest {

    public static void main(String[] args) {

        Object o  = new Object();
        // wenn ein Object aus gegeben wird , muss erst mal in String konvertiert werden
        // passiert automatisch durch Aufruf von toString()
        System.out.println(o);

        int i = 245393274;
        System.out.println(Integer.toHexString(i));   // umwandeln Dez in Hex

        String a = "Hallo Welt";
        //String b = "Hallo Welt";
        String b = new String("hallo Welt");

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        User u = new User();
        u.hashCode();// object vererbt siehe user

        System.out.println(u);// toString wird automatsch verwendet

        //System.out.println(KlasseB);

    }
}
