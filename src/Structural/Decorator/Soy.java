package Structural.Decorator;

/**
 * Created by sshkim on 2016. 11. 14..
 */
public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 대두";
    }

    @Override
    public int cost() {
        return 200;
    }
}
