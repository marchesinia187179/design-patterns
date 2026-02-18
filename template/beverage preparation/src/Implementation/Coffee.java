package Implementation;

import Template.CaffeineBeverage;

public class Coffee extends CaffeineBeverage {

    @Override
    protected void boilWater() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    protected void brew() {
        System.out.println("Adding sugar and milk");
    }
    
}
