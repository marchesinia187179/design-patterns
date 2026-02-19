package Proxy;

import Subject.Door;

public class SecuredDoor implements Door {
    private Door door;

    public SecuredDoor(Door door) {
        this.door = door;
    }

    @Override
    public void open(String password) {
        if (authenticate(password)) {
            door.open("");
        } else {
            System.out.println("Big no! It ain't possible.");
        }
    }

    private boolean authenticate(String password) {
        return "1234".equals(password);
    }

    @Override
    public void close() {
        door.close();
    }
    
}
