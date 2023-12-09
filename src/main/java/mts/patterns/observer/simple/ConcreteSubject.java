package mts.patterns.observer.simple;

import mts.patterns.observer.simple.interfaces.Observer;
import mts.patterns.observer.simple.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    public ConcreteSubject() {
    }

    private List<Observer> observerList = new ArrayList<>();
    private String state;

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {

    }
    @Override
    public void notifyObservers() {

        for (Observer observer: observerList) {
            observer.update(state);
        }

    }


    public List<Observer> getObserverList() {
        return observerList;
    }

    public void setObserverList(List<Observer> observerList) {
        this.observerList = observerList;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }
}
