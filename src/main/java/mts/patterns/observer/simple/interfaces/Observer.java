package mts.patterns.observer.simple.interfaces;

public interface Observer {

    void update(String state);

    String getState();
}
