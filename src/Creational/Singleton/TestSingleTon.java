package Creational.Singleton;

import java.util.concurrent.Callable;

/**
 * Created by sshkim on 2016. 11. 10..
 */
public class TestSingleTon implements Callable {
    @Override
    public Object call() throws Exception {
        Singleton singleton = Singleton.getInstance();
        return singleton.hashCode();
    }
}
