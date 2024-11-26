package structural.adapter;

/*
 * El patrón adaptador actúa como un conector entre dos interfaces que son incompatibles y 
 * que no pueden estar contectadas directamente. 
 */
public class Main {

    public static void main(String[] args) {

        TeslaPricer teslaPricer = new TeslaPricer();
        AdapterPricer adapterPricer = new AdapterPricerImpl(teslaPricer);

        System.out.println("Tesla price in dolars: " + teslaPricer.getPrice());
        System.out.println("Tesla price in euros: " + adapterPricer.getPrice());
    }
}
