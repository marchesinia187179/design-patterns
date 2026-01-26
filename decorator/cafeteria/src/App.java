import Component.Coffee;
import ConcreteComponent.Espresso;
import ConcreteComponent.SimpleCoffee;
import ConcreteDecorator.MilkDecorator;
import ConcreteDecorator.SugarDecorator;

public class App {
    public static void main(String[] args) throws Exception {
        Coffee coffee1 = new SimpleCoffee();
        Coffee coffee2 = new Espresso();

        System.out.println(coffee1.getDescription() + " €" + coffee1.getCost());
        System.out.println(coffee2.getDescription() + " €" + coffee2.getCost());

        coffee1 = new MilkDecorator(coffee1);
        coffee2 = new SugarDecorator(coffee2);

        System.out.println(coffee1.getDescription() + " €" + coffee1.getCost());
        System.out.println(coffee2.getDescription() + " €" + coffee2.getCost());

    }
}
