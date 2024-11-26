package behavioral.observer;

/*
 * El patrón observador (observer en inglés) describe una solución que se asemeja al manejo de eventos. 
 * Principalmente es utilizado para permitir que ciertos objetos puedan reaccionar a los cambios que suceden 
 * en un momento dado entre objetos. 
 */
public class Main {

    public static void main(String[] args) {
        Subject concreteSubject = new ConcreteSubject();

        Observer concreteObserverOne = new ConcreteObserver();
        Observer concreteObserverTwo = new ConcreteObserver();
        Observer concreteObserverThree = new ConcreteObserver();

        concreteSubject.attach(0, concreteObserverOne);
        concreteSubject.attach(0, concreteObserverTwo);
        concreteSubject.attach(1, concreteObserverOne);
        concreteSubject.attach(1, concreteObserverThree);
        concreteSubject.attach(2, concreteObserverTwo);
        concreteSubject.attach(3, concreteObserverThree);

        Event mainEvent = new Event(0, "Main event");
        Event firstEvent = new Event(1, "First event");
        Event secondEvent = new Event(2, "Second event");
        Event thirdEvent = new Event(3, "Third event");

        concreteSubject.notifyObserver(0, mainEvent);
        concreteSubject.notifyObserver(1, firstEvent);
        concreteSubject.notifyObserver(2, secondEvent);
        concreteSubject.notifyObserver(3, thirdEvent);
    }
}
