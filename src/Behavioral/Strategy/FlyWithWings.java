package Behavioral.Strategy;

/**
 * Created by sshkim on 2016. 11. 10..
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("난다!");
    }
}
