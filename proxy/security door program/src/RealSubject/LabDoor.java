package RealSubject;

import Subject.Door;

public class LabDoor implements Door {

    @Override
    public void open(String password) {
        System.out.println("Opening lab door");
    }

    @Override
    public void close() {
        System.out.println("Closing lab door");
    }
    
}
