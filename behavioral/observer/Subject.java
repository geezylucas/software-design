package behavioral.observer;

public interface Subject {

    public void attach(int eventTpye, Observer observer);

    public void detach(int eventTpye, Observer observer);

    public void notifyObserver(int eventTpye, Event event);

}
