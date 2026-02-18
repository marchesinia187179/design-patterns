package Context;

import ConcreteState.DispensingState;
import ConcreteState.IdleState;
import ConcreteState.SelectingState;
import State.CoffeeMachineState;

public class CoffeeMachine {
    private CoffeeMachineState idleState;
    private CoffeeMachineState selectingState;
    private CoffeeMachineState dispensingState;

    private CoffeeMachineState currentState;

    public CoffeeMachine() {
        this.idleState = new IdleState(this);
        this.selectingState = new SelectingState(this);
        this.dispensingState = new DispensingState(this);

        this.currentState = idleState;
    }
    
    public CoffeeMachineState getIdleState() {
        return idleState;
    }

    public CoffeeMachineState getSelectingState() {
        return selectingState;
    }

    public CoffeeMachineState getDispensingState() {
        return dispensingState;
    }

    public CoffeeMachineState getCurrentState() {
        return currentState;
    }

    public void setState(CoffeeMachineState state) {
        currentState = state;
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void selectCoffee() {
        currentState.selectCoffee();
    }

    public void dispenseCoffee() {
        currentState.dispenseCoffee();
    }

}
