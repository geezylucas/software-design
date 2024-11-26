package structural.decorator;

public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza pizzaTemporal) {
        super(pizzaTemporal);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", mozzarella";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.50;
    }
}
