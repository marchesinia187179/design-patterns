import CommandBase.Command;
import ConcreteCommand.TurnOff;
import ConcreteCommand.TurnOn;
import Invoker.RemoteControl;
import Receiver.Bulb;

public class App {
    public static void main(String[] args) throws Exception {
        Bulb bulb = new Bulb();

        Command turnOn = new TurnOn(bulb);
        Command turnOff = new TurnOff(bulb);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.submit(turnOn);
        remoteControl.submit(turnOff);
    }
}
