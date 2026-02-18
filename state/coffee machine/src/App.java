import Context.CoffeeMachine;

public class App {
    public static void main(String[] args) throws Exception {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.insertCoin();
        coffeeMachine.selectCoffee();
        coffeeMachine.dispenseCoffee();
    }
}
