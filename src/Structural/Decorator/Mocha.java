package Structural.Decorator;

/**
 * Created by sshkim on 2016. 11. 14..
 */
public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    @Override
    public int cost() {
        return 500 + beverage.cost();
    }
}
