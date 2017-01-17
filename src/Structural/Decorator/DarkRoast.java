package Structural.Decorator;

/**
 * Created by sshkim on 2016. 11. 14..
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        this.description = "다크로스트";
    }

    @Override
    public int cost() {
        return 2000;
    }
}
