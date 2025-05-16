package lld.strategy_pattern;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        if (paymentStrategy == null) {
            System.out.println("Payment strategy not set.");
            return;
        }
        paymentStrategy.pay(amount);
    }
}
