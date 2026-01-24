package ConcreteStrategy;

import Strategy.PaymentStrategy;

public class Paypal implements PaymentStrategy {
    private String email;

    public Paypal(String email) {
        this.email = email;
    }

    @Override
    public void pay(Double amount) {
        System.out.println("Paid " + amount + " using paypal!");
    }
    
}
