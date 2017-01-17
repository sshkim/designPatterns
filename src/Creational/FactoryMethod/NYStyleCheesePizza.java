package Creational.FactoryMethod;

/**
 * Created by sshkim on 2016. 11. 10..
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        this.name = "NY Style CheesePizza";
        this.dough = "Thin Crust Dough";
        this.sauce = "Marinara Sauce";
        this.toppings.add("Grated Reggiano Cheese");
    }
}
