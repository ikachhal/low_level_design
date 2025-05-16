package lld.factory_pattern;

public class Platinum implements Subscription {
    private String subscriptionType;
    private Database database;

    public Platinum(Database database) {
        this.subscriptionType = "PLATINUM";
        this.database = database;
    }

    @Override
    public String getSubscriptionType() {
        return subscriptionType;
    }

    @Override
    public void addSubscription(Customer customer) {
        database.addSubscription(customer.id, "PLATINUM");
        System.out.println("Adding Platinum subscription");
    }

    @Override
    public void removeSubscription(Customer customer) {
        database.removeSubscription(customer.id);
        System.out.println("Removing Platinum subscription");

    }

    @Override
    public void updateSubscription(Customer customer) {
        database.removeSubscription(customer.id);
        database.addSubscription(customer.id, "PLATINUM");
        System.out.println("Updating Platinum subscription");
    }
}
