package creational.factorymethod;

import creational.factorymethod.cars.CarsFactory;
import creational.factorymethod.cars.NissanFactory;
import creational.factorymethod.cars.ToyotaFactory;
import creational.factorymethod.products.Car;

/*
 * Patrón creacional que provee una interfaz o clase abstracta (creator) que permite encapsular 
 * la lógica de creación de los objetos en subclases. Las subclases deciden qué clase instanciar.
 * Los objetos se crean a partir de un método y no a través de un constructor como se hace normalmente.
 */
public class Main {

    public static void main(String[] args) {
        CarsFactory factory;
        Car carCreated;

        factory = new NissanFactory();

        System.out.println("For Tsuru:");
        carCreated = factory.createProduct("tsuru");
        if (carCreated != null) {
            System.out.println(carCreated.toString());
        } else {
            System.out.println("No product created.");
        }

        System.out.println("For Versa:");
        carCreated = factory.createProduct("versa");
        if (carCreated != null) {
            System.out.println(carCreated.toString());
        } else {
            System.out.println("No product created.");
        }

        factory = new ToyotaFactory();

        System.out.println("For Corolla:");
        carCreated = factory.createProduct("corolla");
        if (carCreated != null) {
            System.out.println(carCreated.toString());
        } else {
            System.out.println("No product created.");
        }

        System.out.println("For Camry:");
        carCreated = factory.createProduct("camry");
        if (carCreated != null) {
            System.out.println(carCreated.toString());
        } else {
            System.out.println("No product created.");
        }

        System.out.println("For Spark:");
        carCreated = factory.createProduct("spark");
        if (carCreated != null) {
            System.out.println(carCreated.toString());
        } else {
            System.out.println("No product created.");
        }
    }
}
