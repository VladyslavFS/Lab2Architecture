package factories;

import sedanCars.AudiA6;
import sedanCars.SedanCars;
import suvCars.AudiQ7;
import suvCars.SuvCars;

public class AudiFactory implements CarsFactory {
    public SuvCars createSuvCars() {
        return new AudiQ7();
    }

    public SedanCars createSedanCars() {
        return new AudiA6();
    }
}
