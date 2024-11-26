package structural.adapter;

public class TeslaPricer implements Pricer {

    @Override
    public double getPrice() {
        return 2000000;
    }
}
