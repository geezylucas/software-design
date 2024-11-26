package creational.abstractfactory;

import creational.abstractfactory.factories.AbstractFactory;
import creational.abstractfactory.factories.AirbusFactory;
import creational.abstractfactory.factories.BoeingFactory;
import creational.abstractfactory.products.Plane;
import creational.abstractfactory.products.Helicopter;

/*
 * Patrón creacional que pemite crear familia de objetos sin tener que especificar la clase concreta 
 * usando interfaces. Es similar a Factory Method pero esta vez, se crean familia o grupos de factorías 
 * (factoría de factorías) por lo que se tienen varios métodos de creación en vez de uno solo.  
 */
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
