package Structural.Facade;

/**
 * Created by sshkim on 2017. 1. 18..
 */
public class DvdPlayer {
    public void on() {
        System.out.println("Dvd 플레이어 전원을 켭니다.");
    }

    public void play(String movie) {
        System.out.println(movie + "를 시청합니다.");
    }

    public void stop() {
        System.out.println("Dvd 플레이어를 종료합니다.");
    }

    public void eject() {
        System.out.println("Cd를 꺼냅니다.");
    }

    public void off() {
        System.out.println("Dvd 플레이어 전원을 끕니다.");
    }
}
