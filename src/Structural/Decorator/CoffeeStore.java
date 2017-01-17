package Structural.Decorator;

/**
 * Created by sshkim on 2016. 11. 14..
 */
public class CoffeeStore {

    public static void main(String args[]) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " cost: " + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);

        System.out.println(beverage1.getDescription() + " cost: " + beverage1.cost());
    }


}
