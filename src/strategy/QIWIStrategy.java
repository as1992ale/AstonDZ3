package strategy;

class QIWIStrategy implements PaymentStrategyInterface {
    @Override
    public void pay(int amount) {
        System.out.println("Payid " + amount + " using QIWI");
    }
}