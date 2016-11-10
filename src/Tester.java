import Factory.ChicagoPizzaStore;
import Factory.NYPizzaStore;
import Factory.Pizza;
import Factory.PizzaStore;
import Observer.CurrentConditions;
import Observer.ForecastDisplay;
import Observer.StatisticsDisplay;
import Observer.WeatherData;
import Singleton.Singleton;
import Singleton.TestSingleTon;
import Strategy.Duck;
import Strategy.FlyNoWay;
import Strategy.MallardDuck;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Tester {


    @Test
    public void strategyPattern() {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();
    }


    // TODO
    @Test
    public void observerPattern() {
        WeatherData weatherData = new WeatherData();

        CurrentConditions currentConditions = new CurrentConditions(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurementsChanged(85, 62, 36.7f);
    }

    @Test
    public void factoryPattern() {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza nyStypePizza = nyStore.orderPizza("cheese");
        System.out.println(nyStypePizza.getName());
        System.out.println();
        Pizza chicagoStypePizza = chicagoStore.orderPizza("cheese");
        System.out.println(chicagoStypePizza.getName());
    }

    @Test
    public void singletonPattern() {
        List runnableList = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5; i++) {
            runnableList.add(new TestSingleTon());
        }

        try {
            List<Future> list = executorService.invokeAll(runnableList);

            for (Future future : list) {
                System.out.println(future.get());
            }

        } catch (Exception e) {
        }
    }

}
