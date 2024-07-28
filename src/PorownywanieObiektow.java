import java.util.Random;

public class PorownywanieObiektow {
    public static void main(String[] args) {
        int i = 5;
        int j = 5;

        System.out.println(i == j);

        Random random = new Random();
        Address address = new Address();
        Client c1 = new Client("Janusz", "Kowalski", 30, 123);
        Client c2 = new Client("Janusz", "Kowalski", 30, 123);
        //Client c2 = c1;

        System.out.println(c1 == c2);

        System.out.println(c1.equals(c2));

        String s1 = new String("OK");
        String s2 = "OK";

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        String s3 = "OK";
        String s4 = "OK";

        s4 = s4 + "X";

        System.out.println(s3);
        System.out.println(s4);
    }
}
