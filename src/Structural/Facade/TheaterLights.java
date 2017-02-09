package Structural.Facade;

/**
 * Created by sshkim on 2017. 1. 18..
 */
public class TheaterLights {
    private int volumn;

    public void dim(int volumn) {
        this.volumn = volumn;
    }

    public void on() {
        System.out.println("조명을 끕니다.");
    }
}
