package Behavioral.Command;

/**
 * Created by sshkim on 2017. 1. 19..
 */
public class StereoOffCommand implements Command {
    Stereo stereo;

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCD("Title");
        stereo.setVolume(11);
    }
}
