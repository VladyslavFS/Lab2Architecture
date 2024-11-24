import factories.CarsFactory;
import sedanCars.SedanCars;
import suvCars.SuvCars;

class Client {
    private CarsFactory carFactory;

    public Client(CarsFactory carFactory) {
        this.carFactory = carFactory;
    }

    public void orderCar() {
        SuvCars suv = carFactory.createSuvCars();
        SedanCars sedan = carFactory.createSedanCars();
        suv.driveOffRoad();
        sedan.drive();
    }
}