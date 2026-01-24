# Strategy Design Pattern Implementation: Payment System

## Pattern Explanation
The **Strategy Design Pattern** is a behavioral design pattern that enables selecting an algorithm's behavior at runtime. Instead of implementing a single algorithm directly, a class (the Context) receives instructions to use one of many different algorithms (the Strategies).

### Key Benefits:
* **Open/Closed Principle**: You can introduce new strategies without having to change the context.
* **Separation of Concerns**: The business logic of how a task is performed (e.g., payment processing) is isolated from the class that uses it (e.g., the shopping cart).
* **Flexibility**: Allows the client to switch between different implementations of an action dynamically.

---

## Project Implementation
The provided Java project implements the Strategy pattern to handle different payment methods within a shopping application.

### 1. The Strategy Interface
**`PaymentStrategy.java`** defines the contract for all supported payment algorithms. It declares a single method, `pay(Double amount)`, which all concrete strategies must implement.

### 2. Concrete Strategies
These classes provide specific implementations of the `PaymentStrategy` interface:
* **`CreditCard.java`**: Implements payment using a card number.
* **`Paypal.java`**: Implements payment using an email address.

Each class overrides the `pay` method to perform its specific logic (in this case, printing a confirmation message to the console).

### 3. The Context
**`ShoppingCart.java`** acts as the Context. It maintains a list of `Item` objects and calculates the total price. Crucially, its `pay` method does not know which payment method is being used; it simply accepts a `PaymentStrategy` object and calls its `pay` method.

### 4. The Model
**`Item.java`** is a simple data model representing a product with a code and a price.

---

## UML Class Diagram
Below is the architectural structure of the project using Mermaid.js syntax:

```mermaid
classDiagram
    class PaymentStrategy {
        <<interface>>
        +pay(Double amount)
    }

    class CreditCard {
        -String cardNumber
        +pay(Double amount)
    }

    class Paypal {
        -String email
        +pay(Double amount)
    }

    class ShoppingCart {
        -List<Item> items
        +addItem(Item item)
        +removeItem(Item item)
        +calculateTotal() Double
        +pay(PaymentStrategy paymentStrategy)
    }

    class Item {
        -String code
        -Double price
        +getCode() String
        +getPrice() Double
    }

    PaymentStrategy <|.. CreditCard : implements
    PaymentStrategy <|.. Paypal : implements
    ShoppingCart o-- Item : aggregates

    ShoppingCart ..> PaymentStrategy : uses (Strategy)
```

---

## Usage
The `App.java` class demonstrates how to interact with the system. You can switch between `CreditCard` and `Paypal` seamlessly at runtime.

```java
import ConcreteStrategy.CreditCard;
import ConcreteStrategy.Paypal;
import Context.ShoppingCart;
import Model.Item;

public class App {
    public static void main(String[] args) throws Exception {
        // Initialize the Context
        ShoppingCart cart = new ShoppingCart();

        // Add items to the cart
        Item item1 = new Item("1234", 8.90);
        Item item2 = new Item("5678", 5.99);
        cart.addItem(item1);
        cart.addItem(item2);

        // Pay using Credit Card Strategy
        cart.pay(new CreditCard("1234-5678-9012-3456"));
        
        // Modify cart and pay using Paypal Strategy
        cart.removeItem(item2);
        cart.pay(new Paypal("email@example.com"));
    }
}
```
