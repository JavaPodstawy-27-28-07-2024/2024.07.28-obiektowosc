import java.util.Random;

public class App {
    public static void main(String[] args) {
        Client klient1 = new Client();
        int i = 5;
        Random losowacz = new Random();
        Client klient2 = new Client();
        int[] tab = new int[10];

        System.out.println(tab);
        System.out.println(klient2);

        Client klient3 = new Client();
        Client klient4 = klient3;

        klient3.name = "Janusz";
        klient3.surname = "Kowalski";
        klient3.age = 30;
        klient3.pesel = 1231233123;

        System.out.println(klient3.name);
        System.out.println(klient3.surname);

        System.out.println(klient4.name);
        System.out.println(klient4.surname);

        klient3.name = "Wiesiek";

        System.out.println(klient3.name);
        System.out.println(klient4.name);

        Client c1 = new Client();
        Client c2 = new Client();

        c1.name = "Janusz";
        c2.name = "Wiesiek";

        System.out.println(c1.name);
        System.out.println(c2.name);
    }
}
