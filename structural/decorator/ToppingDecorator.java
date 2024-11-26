package structural.decorator;

public class ToppingDecorator implements Pizza {

    private Pizza temporalPizza;

    public ToppingDecorator(Pizza temporalPizza) {
        this.temporalPizza = temporalPizza;
    }

    @Override
    public String getDescription() {
        return temporalPizza.getDescription();
    }

    @Override
    public double getPrice() {
        return temporalPizza.getPrice();
    }
}
