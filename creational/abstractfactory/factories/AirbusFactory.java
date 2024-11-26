package creational.abstractfactory.factories;

import creational.abstractfactory.products.Plane;
import creational.abstractfactory.products.AirbusPlane;
import creational.abstractfactory.products.Helicopter;
import creational.abstractfactory.products.AirbusHelicopter;

public class AirbusFactory implements AbstractFactory {

    @Override
    public Plane createPlane(String type) {
        // Logica de negocio para crear un avion airbus
        System.out.println("Creating Airbus plane " + type + "...");
        return new AirbusPlane();
    }

    @Override
    public Helicopter creaHelicopter(String type) {
        // Logica de negocio para crear un helicoptero airbus
        System.out.println("Creating Airbus helicopter " + type + "...");
        return new AirbusHelicopter();
    }
}
