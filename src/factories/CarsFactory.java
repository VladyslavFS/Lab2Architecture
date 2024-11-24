package factories;

import sedanCars.SedanCars;
import suvCars.SuvCars;

// Interface for factories.CarsFactory
public interface CarsFactory {
    SuvCars createSuvCars();

    SedanCars createSedanCars();
}
