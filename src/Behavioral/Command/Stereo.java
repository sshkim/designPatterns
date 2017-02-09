package Behavioral.Command;

/**
 * Created by sshkim on 2017. 1. 19..
 */
public class Stereo {
    public void on() {
        System.out.println("전원을 켭니다.");
    }

    public void setCD(String title) {
        System.out.println(title + " 이 설정되었습니다.");
    }

    public void setVolume(int volume) {
        System.out.println(volume + "으로 볼륨이 설정되었습니다.");
    }

    public void off() {
        System.out.println("전원을 끕니다.");
    }
}
