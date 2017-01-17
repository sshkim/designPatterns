package Behavioral.Strategy;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("꿱꿱.");
    }
}
