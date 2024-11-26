package structural.decorator;

public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza pizzaTemporal) {
        super(pizzaTemporal);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", tomato sauce";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2.50;
    }
}
