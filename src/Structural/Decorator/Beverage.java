package Structural.Decorator;

/**
 * Created by sshkim on 2016. 11. 14..
 */
public abstract class Beverage {

    public String description = "Empty";

    public String getDescription(){
        return this.description;
    }

    public abstract int cost();
}
