package structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

    private static final List<String> blockedSites;
    private final Internet internet = new RealInternet();

    static {
        blockedSites = new ArrayList<>();
        blockedSites.add("blocked.com");
    }

    @Override
    public void connectTo(String host) {
        if (blockedSites.contains(host)) {
            System.out.println("Access blocked to " + host);
        } else {
            internet.connectTo(host);
        }
    }
}
