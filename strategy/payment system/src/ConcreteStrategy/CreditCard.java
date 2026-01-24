package ConcreteStrategy;

import Strategy.PaymentStrategy;

public class CreditCard implements PaymentStrategy {
    private String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(Double amount) {
        System.out.println("Paid " + amount + " using credit card!");
    }
    
}
