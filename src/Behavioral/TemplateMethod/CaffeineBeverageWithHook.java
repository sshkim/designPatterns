package Behavioral.TemplateMethod;

/**
 * Created by sshkim on 2017. 1. 17..
 */
public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    boolean customerWantsCondiments() {
        return true;
    }

    void pourInCup() {
        System.out.println("컵에 따르는 중.");
    }

    abstract void addCondiments();

    abstract void brew();

    void boilWater() {
        System.out.println("물 끓이는 중");
    }
}
