package behavioral.strategy;

/*
 * El patrón estrategia defina una familia de algoritmos, quedando encapsulados y pudiendo 
 * intercambiarse entre ellos. Los algoritmos quedan independientes de los clientes que lo usan.
 */
public class Main {

    public static void main(String[] args) {
        Robot roboto = new Robot();
        roboto.setName("Mr. Roboto");
        roboto.setBehavior(new AgressiveBehavior());

        roboto.move();
    }
}
