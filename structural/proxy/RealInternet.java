package structural.proxy;

public class RealInternet implements Internet {

    @Override
    public void connectTo(String host) {
        System.out.println("Successfully connected to " + host);
    }
}
