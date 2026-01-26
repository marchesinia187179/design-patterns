package ConcreteCreator;

import ConcreteProduct.CommunityExecutive;
import Creator.HiringManager;
import Product.Interviewer;

public class MarketingManager extends HiringManager {

    @Override
    protected Interviewer makeInterviewer() {
        return new CommunityExecutive();
    }
    
}
