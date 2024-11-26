package creational.abstractfactory.factories;

import creational.abstractfactory.products.Plane;
import creational.abstractfactory.products.Helicopter;

public interface AbstractFactory {

    public Plane createPlane(String type);

    public Helicopter creaHelicopter(String type);
}
