public class Client {
    String name;
    String surname;
    int age;
    long pesel;
    Address address;

    Client(String name, String surname, int age, long pesel) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.pesel = pesel;
    }

    Client() {
    }

    int dodaj(int a, int b) {
        return a + b;
    }

    double dodaj(double a, double b) {
        //???
        return a + b;
    }

    int dodajTrzyLiczby(int pierwsz, int druga, int trzecia) {
        return pierwsz + druga + trzecia;
    }

    void powiedzImieINazwisko(String imie, String nazwisko) {
        String sklejone = imie + " " + nazwisko;
        System.out.println(sklejone);
    }

    void powiedzJakSieNazywasz() {
        System.out.println(this.name);
    }
}
