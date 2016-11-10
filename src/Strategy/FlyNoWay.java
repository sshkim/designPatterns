package Strategy;

/**
 * Created by sshkim on 2016. 11. 10..
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날지못해요.");
    }
}
