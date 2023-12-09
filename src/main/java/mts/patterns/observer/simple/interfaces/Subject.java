package mts.patterns.observer.simple.interfaces;

public interface Subject {

    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObservers();

    void setState(String s);
}
