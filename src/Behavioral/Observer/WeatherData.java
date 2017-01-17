package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sshkim on 2016. 11. 10..
 */
public class WeatherData implements Subject {
    private List<Observer> observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    {
        this.observerList = new ArrayList<>();
    }

    public void measurementsChanged() {
        this.notifyObservers();
    }

    public void setMeasurementsChanged(float t, float h, float p) {
        this.temperature = t;
        this.humidity = h;
        this.pressure = p;
        this.measurementsChanged();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observerList.contains(observer)) observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(this.temperature, this.humidity, this.pressure);
        }
    }
}
