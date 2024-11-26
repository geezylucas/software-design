package creational.abstractfactory.factories;

import creational.abstractfactory.products.Plane;
import creational.abstractfactory.products.BoeingPlane;
import creational.abstractfactory.products.Helicopter;
import creational.abstractfactory.products.BoeingHelicopter;

public class BoeingFactory implements AbstractFactory {

    @Override
    public Plane createPlane(String type) {
        // Logica de negocio para crear un avion boeing
        System.out.println("Creating Boeing plane " + type + "...");
        return new BoeingPlane();
    }

    @Override
    public Helicopter creaHelicopter(String type) {
        // Logica de negocio para crear un helicoptero boeing
        System.out.println("Creating Boeing helicopter " + type + "...");
        return new BoeingHelicopter();
    }
}
