import factories.AudiFactory;
import factories.CarsFactory;
import factories.ToyotaFactory;

public class Main {
    public static void main(String[] args) {
        CarsFactory toyotaFactory = new ToyotaFactory();
        CarsFactory audiFactory = new AudiFactory();

        Client client1 = new Client(toyotaFactory);
        Client client2 = new Client(audiFactory);

        System.out.println("Ordering cars from Toyota:");
        client1.orderCar();

        System.out.println("\nOrdering cars from Audi:");
        client2.orderCar();
    }
}
