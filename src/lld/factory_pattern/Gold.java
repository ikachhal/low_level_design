package lld.factory_pattern;

public class Gold implements Subscription {
    private String subscriptionType;
    private Database database;

    public Gold(Database database) {
        this.subscriptionType = "Gold";
        this.database = database;
    }

    @Override
    public String getSubscriptionType() {
        return subscriptionType;
    }

    @Override
    public void addSubscription(Customer customer) {
        database.addSubscription(customer.id, "GOLD");
        System.out.println("Adding Gold subscription");
    }

    @Override
    public void removeSubscription(Customer customer) {
        database.removeSubscription(customer.id);
        System.out.println("Removing Gold subscription");

    }

    @Override
    public void updateSubscription(Customer customer) {
        database.removeSubscription(customer.id);
        database.addSubscription(customer.id, "GOLD");
        System.out.println("Updating Gold subscription");

    }
}
