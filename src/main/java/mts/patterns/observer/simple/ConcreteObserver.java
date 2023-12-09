package mts.patterns.observer.simple;

import mts.patterns.observer.simple.interfaces.Observer;

public class ConcreteObserver implements Observer {

    public ConcreteObserver() {
    }

    private String state;
    @Override
    public void update(String state) {
        setState(state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
