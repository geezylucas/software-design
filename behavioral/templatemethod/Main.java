package behavioral.templatemethod;

public class Main {

    public static void main(String[] args) {
        // Mantiene una base de estructura para una serie de metodos individuales que se
        // ejecutan en orden
        // y pueden ser implementado manteniendo un orden evitando duplicar codigo

        BaseGameLoader minecraftLoader = new MinecraftLoader();
        minecraftLoader.load();

        System.out.println("\n************************************************\n");

        BaseGameLoader fortniteLoader = new FortniteLoader();
        fortniteLoader.load();
    }
}
