import Implementation.Coffee;
import Implementation.Tea;
import Template.CaffeineBeverage;

public class App {
    public static void main(String[] args) throws Exception {
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();

        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
