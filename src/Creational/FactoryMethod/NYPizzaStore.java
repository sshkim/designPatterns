package Creational.FactoryMethod;

/**
 * Created by sshkim on 2016. 11. 10..
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type){
            case "cheese": pizza = new NYStyleCheesePizza();
                break;
            case "peper": pizza = new NYStylePepperoniPizza();
                break;
            case "clam": pizza = new NYStyleClamPizza();
                break;
            case "veggie": pizza = new NYStyleVeggiePizza();
                break;
        }

        return pizza;
    }
}
