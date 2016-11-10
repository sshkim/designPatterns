package Observer;

/**
 * Created by sshkim on 2016. 11. 10..
 */
public class CurrentConditions implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditions(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions :" + temperature + "," + humidity);
    }
}
