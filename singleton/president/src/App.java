import Singleton.SingletonPresident;

public class App {
    public static void main(String[] args) throws Exception {
        SingletonPresident president = SingletonPresident.getInstance();
        president.showMessage();
    }
}
