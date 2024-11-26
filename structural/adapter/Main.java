package structural.adapter;

public class Main {

    public static void main(String[] args) {

        TeslaPricer teslaPricer = new TeslaPricer();
        AdapterPricer adapterPricer = new AdapterPricerImpl(teslaPricer);

        System.out.println("Tesla price in dolars: " + teslaPricer.getPrice());
        System.out.println("Tesla price in euros: " + adapterPricer.getPrice());
    }
}
