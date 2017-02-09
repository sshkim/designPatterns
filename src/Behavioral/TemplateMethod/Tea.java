package Behavioral.TemplateMethod;

/**
 * Created by sshkim on 2017. 1. 17..
 */
public class Tea extends CaffeineBeverageWithHook{

    @Override
    void addCondiments() {
        System.out.println("레몬을 추가하는 중");
    }

    @Override
    void brew() {
        System.out.println("차를 우려내는 중");
    }
}
