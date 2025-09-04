package strategy;

class QIWIPaymentStrategy implements PaymentStrategyInterface {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using QIWI");
    }
}