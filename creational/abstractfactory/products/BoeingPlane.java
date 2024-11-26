package creational.abstractfactory.products;

public class BoeingPlane implements Plane {

    @Override
    public void build() {
        // Logica de negocio para armar un avion boeing
        System.out.println("Avion Boeing manufactured!");
        System.out.println("----------------------");
    }
}