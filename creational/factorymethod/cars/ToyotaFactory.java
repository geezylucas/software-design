package creational.factorymethod.cars;

import creational.factorymethod.products.Camry;
import creational.factorymethod.products.Car;
import creational.factorymethod.products.Corolla;

public class ToyotaFactory implements CarsFactory {

    @Override
    public Car createProduct(String productName) {
        Car car = null;

        if (productName.equalsIgnoreCase("CAMRY")) {
            car = new Camry();
        } else if (productName.equalsIgnoreCase("COROLLA")) {
            car = new Corolla();
        }

        return car;
    }

}
