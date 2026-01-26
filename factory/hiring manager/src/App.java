import ConcreteCreator.DevelopmentManager;
import ConcreteCreator.MarketingManager;
import Creator.HiringManager;

public class App {
    public static void main(String[] args) throws Exception {
        HiringManager devManager = new DevelopmentManager();
        devManager.takeInterviewer();

        HiringManager marketingManager = new MarketingManager();
        marketingManager.takeInterviewer();
    }
    
}
