package behavioral.observer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class ConcreteSubject implements Subject {

    private final Map<Integer, LinkedList<Observer>> observers;

    public ConcreteSubject() {
        observers = new HashMap<>();
    }

    private LinkedList<Observer> getList(int type) {
        if (!observers.containsKey(type)) {
            observers.put(type, new LinkedList<Observer>());
        }
        return observers.get(type);
    }

    @Override
    public void attach(int eventTpye, Observer newObserver) {
        getList(eventTpye).add(newObserver);
    }

    @Override
    public void detach(int eventTpye, Observer observer) {
        getList(eventTpye).remove(observer);
    }

    @Override
    public void notifyObserver(int eventTpye, Event event) {
        if (observers.containsKey(eventTpye)) {
            Iterator<Observer> iterator = observers.get(eventTpye).iterator();
            while (iterator.hasNext()) {
                iterator.next().update(event);
            }
        }
    }
}
