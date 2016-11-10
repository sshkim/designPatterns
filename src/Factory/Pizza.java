package Factory;

import java.util.ArrayList;

/**
 * Created by sshkim on 2016. 11. 10..
 */
public abstract class Pizza {
    String name, dough, sauce;
    ArrayList<String> toppings = new ArrayList<>();


    public void prepare() {
        System.out.println("Preparing:" + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding source");
        System.out.println("Adding toppings");
        for (String topping : toppings) {
            System.out.println("\ttopping: " + topping);
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return this.name;
    }
}
