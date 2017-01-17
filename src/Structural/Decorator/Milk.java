package Structural.Decorator;

/**
 * Created by sshkim on 2016. 11. 14..
 */
public class Milk extends CondimentDecorator {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 우유";
    }

    @Override
    public int cost() {
        return 500;
    }
}
