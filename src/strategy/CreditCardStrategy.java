package strategy;

class CreditCardPaymentStrategy implements PaymentStrategyInterface {
    public void pay(int amount) {
        System.out.println("Paid" + amount + " with credit card");
    }
}