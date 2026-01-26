package ConcreteProduct;

import Product.Interviewer;

public class CommunityExecutive implements Interviewer {

    @Override
    public void askQuestions() {
        System.out.println("Ask community building related problems!");
    }
    
}
