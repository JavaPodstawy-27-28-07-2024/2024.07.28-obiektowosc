public class App1_5 {
    public static void main(String[] args) {
        Client k1 = new Client();
        Address a1 = new Address();
        a1.city = "Krakow";
        a1.street = "Jakas";
        a1.no = "50B";

        k1.address = a1;

        System.out.println(k1.address.street);

        Client k2 = new Client();
        System.out.println(k2.name);
        System.out.println(k2.surname);
        System.out.println(k2.age);
        System.out.println(k2.pesel);
        System.out.println(k2.address);

        k1.address = new Address();
        k1.address.street = "Ogrodowa";

        System.out.println(k1.address.street);
    }
}
