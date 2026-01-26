package Invoker;

import CommandBase.Command;

public class RemoteControl {
    public void submit(Command command) {
        command.execute();
    }
}
