package Structural.Decorator;

/**
 * Created by sshkim on 2016. 11. 14..
 */
public class Decaf extends Beverage {

    public Decaf() {
        this.description = "디카프";
    }

    @Override
    public int cost() {
        return 0;
    }
}
