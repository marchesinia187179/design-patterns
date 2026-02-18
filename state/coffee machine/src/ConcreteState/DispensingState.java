package ConcreteState;

import Context.CoffeeMachine;
import State.CoffeeMachineState;

public class DispensingState implements CoffeeMachineState {
    private CoffeeMachine coffeeMachine;
    
    public DispensingState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coffee is being made, do not repeat this operation.");
    }

    @Override
    public void selectCoffee() {
        System.out.println("Coffee is being made, do not repeat this operation.");
    }

    @Override
    public void dispenseCoffee() {
        System.out.println("Coffee is ready, please take it.");
        coffeeMachine.setState(coffeeMachine.getIdleState());
    }

}
