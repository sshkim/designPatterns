package Behavioral.Strategy;

/**
 * Created by sshkim on 2016. 11. 10..
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("청둥오리 입니다.");
    }
}
