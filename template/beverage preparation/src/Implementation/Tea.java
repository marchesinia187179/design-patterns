package Implementation;

import Template.CaffeineBeverage;

public class Tea extends CaffeineBeverage {

    @Override
    protected void boilWater() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void brew() {
        System.out.println("Adding lemon");
    }
    
}
