package behavioral.templatemethod;

/*
 * Este patrón permite definir el esqueleto de un algoritmo para luego implementar los detalles 
 * del mismo mediante herencia, sin cambiar la estructura del algoritmo. 
 */
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
