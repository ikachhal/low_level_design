package lld.strategy_pattern;

public class CreditCardPayment implements PaymentStrategy {
    private final String cardNumber;
    private final String cardHolderName;
    private final String expiryDate;

    public CreditCardPayment(String cardNumber, String cardHolderName, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card: " + cardNumber);
    }
}
