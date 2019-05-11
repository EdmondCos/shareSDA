import com.sda.statics.Client;

public class MainStatics {
    public static void main(String[] args) {
//        Accesez de pe tip de data
        System.out.print("Numar de ordine inaite de creare obiecte: ");
        System.out.println(Client.numarOrdine);

//        Creez primul obiect
        Client client1 = new Client("Ana");
        System.out.print("Numar de ordine dupa creare obiect(1): ");
        System.out.println(Client.numarOrdine);

//        Creez al 2lea obiect
        Client client2 = new Client("Radu");
        System.out.print("Numar de ordine dupa creare obiect(2): ");
        System.out.println(Client.numarOrdine);

        Client.cresteNumarOrdine();
        Client.cresteNumarOrdine();
        Client.cresteNumarOrdine();
        System.out.println("Nr. ord: " + Client.numarOrdine);
    }
}
