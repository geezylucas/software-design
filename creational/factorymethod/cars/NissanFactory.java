package creational.factorymethod.cars;

import creational.factorymethod.products.Car;
import creational.factorymethod.products.Tsuru;
import creational.factorymethod.products.Versa;

public class NissanFactory implements CarsFactory {

    @Override
    public Car createProduct(String productName) {
        Car car = null;

        if (productName.equalsIgnoreCase("TSURU")) {
            car = new Tsuru();
        } else if (productName.equalsIgnoreCase("VERSA")) {
            car = new Versa();
        }

        return car;
    }

}
