package Behavioral.TemplateMethod;

/**
 * Created by sshkim on 2017. 1. 18..
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {
    private boolean userAnswer = false;

    @Override
    void addCondiments() {
        System.out.println("설탕과 우유를 추가하는 중");
    }

    @Override
    void brew() {
        System.out.println("필터를 통해 커피를 우려내는 중");
    }

    @Override
    boolean customerWantsCondiments() {
        if (getUserInput()) return true;
        else return false;
    }

    public void setUserAnswer(boolean answer){
        this.userAnswer = answer;
    }

    private boolean getUserInput() {
        return userAnswer;
    }
}
