package lld.strategy_pattern;

public class PaymentStrategyDemo {
    public static void run() {
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "John Doe", "12/23"));
        cart.checkout(100);

        cart.setPaymentStrategy(new BitCoinPayment());
        cart.checkout(200);
    }
}
