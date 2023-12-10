package mts.patterns.observer.normal;

/**
 * Поскольку запускаю я это на 17 джаве, то использую PropertyChangeListener
 * До 9 джавы можно было использовать наследование от класса Observer. Но теперь он считается устаревшим
 * Можно ещё сделать через спринг и его аспекты - там даже не придётся регистрировать наблюдателей, всё задаётся в конфигурации. Но есть и минусы.
 */
public class NormalClient {


    public static void main(String[] args) {

        ConcreteSubject subject = new ConcreteSubject("Сатус 0");
        ConcreteObserver obs1 = new ConcreteObserver();
        ConcreteObserver obs2 = new ConcreteObserver();

        System.out.println(subject.getState() + " " + obs1.getState() + " " + obs2.getState());

        subject.addObserver(obs1);
        subject.addObserver(obs2);

        System.out.println(subject.getState() + " " + obs1.getState() + " " + obs2.getState());

        subject.setState("Сатус 1");
        System.out.println(subject.getState() + " " + obs1.getState() + " " + obs2.getState());

        subject.setState("Сатус 2");
        System.out.println(subject.getState() + " " + obs1.getState() + " " + obs2.getState());

    }
}
