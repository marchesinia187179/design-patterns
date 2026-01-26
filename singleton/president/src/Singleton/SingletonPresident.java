package Singleton;

public class SingletonPresident {
    private static SingletonPresident uniqueInstance;

    private SingletonPresident() {}

    public static SingletonPresident getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonPresident();
        }

        return uniqueInstance;
    }

    public void showMessage() {
        System.out.println("Hello, I am the president!");
    }
}
