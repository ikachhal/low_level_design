package lld.factory_pattern;

public class FactoryDemo {
    public static void run() {
        Database database = new Database();
        Subscription subscription = SubscriptionFactory.getSubscription("SILVER", database);
        Customer customer = new Customer("1");
        customer.SubscribePlan(subscription);
        System.out.println("Customer " + customer.id + " subscribed to " + subscription.getSubscriptionType() + " plan.");

        // Unsubscribe
        customer.unSubscribePlan();
        System.out.println("Customer " + customer.id + " unsubscribed from " + subscription.getSubscriptionType() + " plan.");

        Subscription subscriptionGold = SubscriptionFactory.getSubscription("GOLD", database);
        Customer customerGold = new Customer("1");
        customerGold.SubscribePlan(subscriptionGold);
        System.out.println("Customer " + customerGold.id + " subscribed to " + subscriptionGold.getSubscriptionType() + " plan.");

        // Unsubscribe
        customerGold.unSubscribePlan();
        System.out.println("Customer " + customerGold.id + " unsubscribed from " + subscriptionGold.getSubscriptionType() + " plan.");

        Subscription subscriptionPlatinum = SubscriptionFactory.getSubscription("PLATINUM", database);
        Customer customerPlatinum = new Customer("1");
        customerPlatinum.SubscribePlan(subscriptionPlatinum);
        System.out.println("Customer " + customerPlatinum.id + " subscribed to " + subscriptionPlatinum.getSubscriptionType() + " plan.");

        // Unsubscribe
        customerPlatinum.unSubscribePlan();
        System.out.println("Customer " + customerPlatinum.id + " unsubscribed from " + subscriptionPlatinum.getSubscriptionType() + " plan.");

    }
}
