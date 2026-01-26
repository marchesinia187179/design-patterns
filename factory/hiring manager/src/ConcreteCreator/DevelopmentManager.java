package ConcreteCreator;

import ConcreteProduct.Developer;
import Creator.HiringManager;
import Product.Interviewer;

public class DevelopmentManager extends HiringManager {

    @Override
    protected Interviewer makeInterviewer() {
        return new Developer();
    }
    
}
