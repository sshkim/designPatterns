package Behavioral.Command;

/**
 * Created by sshkim on 2017. 1. 19..
 */
public class RemoteControl {
    private final int DEFAULT = 7;
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[DEFAULT];
        offCommands = new Command[DEFAULT];
        Command noCommand = new NoCommand();

        for (int i = 0; i < DEFAULT; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setCommands(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < DEFAULT; i++) {
            sb.append(onCommands[i].getClass().getName() + " / " + offCommands[i].getClass().getName() + "\n");
        }
        return sb.toString();
    }

    public void undoButtonWasPushed() {
        undoCommand.execute();
    }
}
