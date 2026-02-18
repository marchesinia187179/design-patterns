package ConcreteState;

import Context.CoffeeMachine;
import State.CoffeeMachineState;

public class IdleState implements CoffeeMachineState {
    private CoffeeMachine coffeeMachine;
    
    public IdleState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin inserted. Please select coffee.");
        coffeeMachine.setState(coffeeMachine.getSelectingState());
    }

    @Override
    public void selectCoffee() {
        System.out.println("Please insert coin first.");
    }

    @Override
    public void dispenseCoffee() {
        System.out.println("Please insert coin and select coffee.");
    }
    
}
