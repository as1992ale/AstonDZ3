package strategy;

class ShoppingCart {
    private PaymentStrategyInterface paymentStrategy;

    public void setPaymentStrategy(PaymentStrategyInterface paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}