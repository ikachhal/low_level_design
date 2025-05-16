package lld.factory_pattern;

public class SubscriptionFactory {
    public static Subscription getSubscription(String subscriptionType, Database database) {
        if (subscriptionType == null) {
            return null;
        }
        if (subscriptionType.equalsIgnoreCase("SILVER")) {
            return new Silver(database);
        } else if (subscriptionType.equalsIgnoreCase("GOLD")) {
            return new Gold(database);
        } else if (subscriptionType.equalsIgnoreCase("PLATINUM")) {
            return new Platinum(database);
        }
        return null;
    }
}
