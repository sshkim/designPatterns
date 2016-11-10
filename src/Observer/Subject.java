package Observer;

/**
 * Created by sshkim on 2016. 11. 10..
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}

