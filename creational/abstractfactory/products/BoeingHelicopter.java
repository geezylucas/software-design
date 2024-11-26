package creational.abstractfactory.products;

public class BoeingHelicopter implements Helicopter {

    @Override
    public void build() {
        // Logica de negocio para armar un helicoptero boeing
        System.out.println("Helicoptero Boeing manufactured!");
        System.out.println("----------------------");
    }
}
