package structural.decorator;

public class PlainPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Thin Dough";
    }

    @Override
    public double getPrice() {
        return 4.00;
    }
}
