package Structural.Decorator;

/**
 * Created by sshkim on 2016. 11. 14..
 */
public class Espresso extends Beverage {

    public Espresso() {
        this.description = "에스프레소";
    }

    @Override
    public int cost() {
        return 3500;
    }
}
