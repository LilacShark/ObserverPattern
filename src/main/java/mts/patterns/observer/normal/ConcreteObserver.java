package mts.patterns.observer.normal;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ConcreteObserver implements PropertyChangeListener {

    private String state;


    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.setState((String) evt.getNewValue());
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
