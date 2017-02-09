import Behavioral.Command.*;
import Behavioral.Iterator.DinerMenu;
import Behavioral.Iterator.Menu;
import Behavioral.Iterator.PanCakeHouseMenu;
import Behavioral.Iterator.Waitress;
import Creational.FactoryMethod.ChicagoPizzaStore;
import Creational.FactoryMethod.NYPizzaStore;
import Creational.FactoryMethod.Pizza;
import Creational.FactoryMethod.PizzaStore;
import Behavioral.Observer.CurrentConditions;
import Behavioral.Observer.ForecastDisplay;
import Behavioral.Observer.StatisticsDisplay;
import Behavioral.Observer.WeatherData;
import Creational.Singleton.TestSingleTon;
import Behavioral.Strategy.Duck;
import Behavioral.Strategy.FlyNoWay;
import Behavioral.Strategy.MallardDuck;
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

    @Test
    public void iteratorPattern(){
        ArrayList<Menu> menus = new ArrayList();
        menus.add(new PanCakeHouseMenu());
        menus.add(new DinerMenu());

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }

    @Test
    public void commandPattern(){
//        SimpleRemoteControl remote = new SimpleRemoteControl();
//        Light light = new Light();
//        LightOnCommand lightOn = new LightOnCommand(light);
//
//        remote.setCommand(lightOn);
//        remote.buttonWasPressed();
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light();
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        remoteControl.setCommands(0, livingRoomLightOn, livingRoomLightOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();

    }

}
