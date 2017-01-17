package Structural.Decorator;

/**
 * Created by sshkim on 2016. 11. 14..
 */
public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑";
    }

    @Override
    public int cost() {
        return 500 + beverage.cost();
    }
}
