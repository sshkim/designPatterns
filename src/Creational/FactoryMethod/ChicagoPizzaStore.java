package Creational.FactoryMethod;

/**
 * Created by sshkim on 2016. 11. 10..
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type){
            case "cheese": pizza = new ChicagoStyleCheesePizza();
                break;
            case "peper": pizza = new ChicagoStylePepperoniPizza();
                break;
            case "clam": pizza = new ChicagoStyleClamPizza();
                break;
            case "veggie": pizza = new ChicagoStyleVeggiePizza();
                break;
        }
        return pizza;
    }
}
