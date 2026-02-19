import Proxy.SecuredDoor;
import RealSubject.LabDoor;

public class App {
    public static void main(String[] args) throws Exception {
        SecuredDoor securedDoor = new SecuredDoor(new LabDoor());

        securedDoor.open("0000");
        securedDoor.open("1234");

        securedDoor.close();
    }
}
