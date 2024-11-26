package structural.proxy;

/* 
 * Es un patrón de diseño estructural que te permite proporcionar un sustituto o marcador de posición 
 * para otro objeto. Un proxy controla el acceso al objeto original, permitiéndote hacer algo antes o 
 * después de que la solicitud llegue al objeto original. 
 */
public class Main {

    public static void main(String[] args) {
        // Controla el acceso a un objeto en particular realizando algo antes o
        // después de que la solicitud llegue a ese objeto

        Internet internet = new ProxyInternet();
        internet.connectTo("google.com");
        internet.connectTo("blocked.com");
    }
}
