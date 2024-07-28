import java.util.Random;

public class Metody {
    public static void main(String[] args) {
        Client client = new Client();
        int wynik = client.dodaj(2,4);
        System.out.println(wynik);

        Random losowacz = new Random();
        int losowaLiczba = losowacz.nextInt(0, 100);
        System.out.println(losowaLiczba);

        int a = 4;
        int b = 7;
        int c = 12;
        int wynik2 = client.dodajTrzyLiczby(a, b, c);
        System.out.println(wynik2);

        client.powiedzImieINazwisko("Mateusz", "Bereda");

        System.out.println("Java !!!");

        int w1 = client.dodaj(3,7);
        double w2 = client.dodaj(3.3,7.7);

        System.out.println(w1);
        System.out.println(w2);

        System.out.println();

        Client client2 = new Client("Janusz", "Kowalski", 30, 123123123);

        System.out.println(client2.name);
        System.out.println(client2.surname);
        System.out.println(client2.age);
        System.out.println(client2.pesel);
    }
}
