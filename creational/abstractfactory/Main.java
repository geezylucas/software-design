package creational.abstractfactory;

import creational.abstractfactory.factories.AbstractFactory;
import creational.abstractfactory.factories.AirbusFactory;
import creational.abstractfactory.factories.BoeingFactory;
import creational.abstractfactory.products.Plane;
import creational.abstractfactory.products.Helicopter;

public class Main {

    public static void main(String[] args) {

        // Se necesita fabricar difentes tipos de aeronaves de diferentes tipos
        // de companias que fabrican aeronaves

        AbstractFactory airbus = new AirbusFactory();
        Plane airbusPlane = airbus.createPlane("A380");
        airbusPlane.build();

        Helicopter airbusHelicopter = airbus.creaHelicopter("H160");
        airbusHelicopter.build();

        AbstractFactory boeing = new BoeingFactory();
        Plane boeingPlane = boeing.createPlane("B747");
        boeingPlane.build();

        Helicopter boeingHelicopter = boeing.creaHelicopter("CH-47");
        boeingHelicopter.build();
    }
}
