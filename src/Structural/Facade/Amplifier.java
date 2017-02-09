package Structural.Facade;

/**
 * Created by sshkim on 2017. 1. 18..
 */
public class Amplifier {
    private DvdPlayer dvd;
    private int volume;

    public void on() {
        System.out.println("엠프 전원을 켭니다.");
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println("Dvd 플레이어와 앰프를 연결합니다.");
        this.dvd = dvd;
    }

    public void setSurroundSound() {
        System.out.println("서라운드 사운드 모드 입니다.");
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void off() {
        System.out.println("앰프 전원을 끕니다.");
    }
}
