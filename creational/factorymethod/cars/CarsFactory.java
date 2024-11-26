package creational.factorymethod.cars;

import creational.factorymethod.products.Car;

public interface CarsFactory {

    public Car createProduct(String productName);
}
