package mts.patterns.observer;

import mts.patterns.observer.simple.ConcreteObserver;
import mts.patterns.observer.simple.ConcreteSubject;
import mts.patterns.observer.simple.interfaces.Observer;
import mts.patterns.observer.simple.interfaces.Subject;

public class Client {

    public static void main(String[] args) {

        Subject subject = new ConcreteSubject();
        Observer obs1 = new ConcreteObserver();
        Observer obs2 = new ConcreteObserver();

        subject.addObserver(obs1);
        subject.addObserver(obs2);

        subject.setState("Сатус 1");
        System.out.println(obs1.getState() + " " + obs2.getState());

        subject.setState("Сатус 2");
        System.out.println(obs1.getState() + " " + obs2.getState());

    }
}
