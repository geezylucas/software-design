package structural.adapter;

public class AdapterPricerImpl implements AdapterPricer {

    private final Pricer pricer;

    public AdapterPricerImpl(Pricer pricer) {
        this.pricer = pricer;
    }

    @Override
    public double getPrice() {
        double priceInDolars = pricer.getPrice();

        return convertToEuros(priceInDolars);
    }

    private double convertToEuros(double price) {
        return price * 0.95;
    }
}
