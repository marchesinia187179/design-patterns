package ConcreteProduct;

import Product.Interviewer;

public class Developer implements Interviewer {

    @Override
    public void askQuestions() {
        System.out.println("Ask design pattern related problems!");
    }
    
}
