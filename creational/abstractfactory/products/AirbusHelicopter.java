package creational.abstractfactory.products;

public class AirbusHelicopter implements Helicopter {

    @Override
    public void build() {
        // Logica de negocio para armar un helicoptero airbus
        System.out.println("Helicoptero Airbus manufactured!");
        System.out.println("----------------------");
    }
}