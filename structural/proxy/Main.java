package structural.proxy;

public class Main {

    public static void main(String[] args) {
        // Controla el acceso a un objeto en particular realizando algo antes o
        // después de que la solicitud llegue a ese objeto

        Internet internet = new ProxyInternet();
        internet.connectTo("google.com");
        internet.connectTo("blocked.com");
    }
}
