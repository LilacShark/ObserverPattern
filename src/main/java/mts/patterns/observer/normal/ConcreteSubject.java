package mts.patterns.observer.normal;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ConcreteSubject {

    private String state;
    private final PropertyChangeSupport monitor;

    public ConcreteSubject(String state) {
        this.state = state;
        this.monitor = new PropertyChangeSupport(this);
    }


    public void addObserver(PropertyChangeListener listener) {

        monitor.addPropertyChangeListener(listener);
    }


    public void deleteObserver(PropertyChangeListener listener) {

        monitor.removePropertyChangeListener(listener);
    }

//    private void notifyObservers(String newState){
//
//        monitor.firePropertyChange("state", this.state, newState);
//    }

    public String getState() {
        return state;
    }

    public void setState(String newState) {
        monitor.firePropertyChange("state", this.state, newState);
        this.state = newState;
    }

}
