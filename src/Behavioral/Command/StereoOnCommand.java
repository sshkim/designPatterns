package Behavioral.Command;

/**
 * Created by sshkim on 2017. 1. 19..
 */
public class StereoOnCommand implements Command {
    Stereo stereo;

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD("Title");
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
