package Behavioral.Strategy;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("삑삑.");
    }
}
