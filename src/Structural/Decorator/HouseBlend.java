package Structural.Decorator;

/**
 * Created by sshkim on 2016. 11. 14..
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "하우스블렌드";
    }

    @Override
    public int cost() {
        return 2000;
    }
}
