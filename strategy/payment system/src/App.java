import ConcreteStrategy.CreditCard;
import ConcreteStrategy.Paypal;
import Context.ShoppingCart;
import Model.Item;

public class App {
    public static void main(String[] args) throws Exception {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 8.90);
        Item item2 = new Item("5678", 5.99);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.pay(new CreditCard("1234-5678-9012-3456"));
        
        cart.removeItem(item2);

        cart.pay(new Paypal("email@example.com"));

    }
}
