public class App2 {
    public static void main(String[] args) {
        int[] tab1 = new int[10];
        for(int element : tab1) {
            System.out.println(element);
        }

        boolean[] tab2 = new boolean[10];
        for(boolean element : tab2) {
            System.out.println(element);
        }

        String[] tab3 = new String[10];
        for(String element : tab3) {
            System.out.println(element);
        }

        Client[] tab4 = new Client[10];
        for(Client client : tab4) {
            System.out.println(client);
        }

        tab4[5].name = "Karol";
    }
}
