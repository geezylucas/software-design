package creational.abstractfactory.products;

public class AirbusPlane implements Plane {

    @Override
    public void build() {
        // Logica de negocio para armar un avion airbus
        System.out.println("Airbud plane manufactured!");
        System.out.println("----------------------");
    }
}