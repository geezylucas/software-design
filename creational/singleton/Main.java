package creational.singleton;

/* 
 * El patrón singleton resuelve el problema de mantener una única instancia de una clase en memoría 
 * durante la ejecución. Este patrón se comporta como un objeto global donde cualquier 
 * parte de la aplicación la puede utilizar.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");

        Thread threadBar = new Thread(new ThreadBar());
        Thread threadFoo = new Thread(new ThreadFoo());
        threadBar.start();
        threadFoo.start();
    }

    private static class ThreadFoo implements Runnable {

        @Override
        public void run() {
            // try {
            // Thread.sleep(2000);
            // } catch (InterruptedException e) {
            // e.printStackTrace();
            // }
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    private static class ThreadBar implements Runnable {

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}
