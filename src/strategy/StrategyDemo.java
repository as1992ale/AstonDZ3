package strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.setPaymentStrategy( new CreditCardPaymentStrategy());
        shoppingCart.checkout(1000);

        shoppingCart.setPaymentStrategy(new QIWIStrategy());
        shoppingCart.checkout(2000);
    }
}