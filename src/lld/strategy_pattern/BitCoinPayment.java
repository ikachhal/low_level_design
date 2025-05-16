package lld.strategy_pattern;

public class BitCoinPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Bitcoin.");
    }
}
