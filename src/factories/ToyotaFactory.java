package factories;

import sedanCars.SedanCars;
import sedanCars.ToyotaCamry;
import suvCars.SuvCars;
import suvCars.ToyotaLandCruiser;

// Concrete factories
public class ToyotaFactory implements CarsFactory {
    public SuvCars createSuvCars() {
        return new ToyotaLandCruiser();
    }

    public SedanCars createSedanCars() {
        return new ToyotaCamry();
    }
}
