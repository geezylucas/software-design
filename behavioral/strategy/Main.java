package behavioral.strategy;

public class Main {

    public static void main(String[] args) {
        Robot roboto = new Robot();
        roboto.setName("Mr. Roboto");
        roboto.setBehavior(new AgressiveBehavior());

        roboto.move();
    }
}
