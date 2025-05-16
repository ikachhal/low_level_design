package lld.factory_pattern;

public class Silver implements Subscription {
    private String subscriptionType;
    private Database database;

    public Silver(Database database) {
        this.subscriptionType = "SILVER";
        this.database = database;
    }

    @Override
    public String getSubscriptionType() {
        return subscriptionType;
    }

    @Override
    public void addSubscription(Customer customer) {
        database.addSubscription(customer.id, "SILVER");
        System.out.println("Adding Silver subscription");
    }

    @Override
    public void removeSubscription(Customer customer) {
        database.removeSubscription(customer.id);
        System.out.println("Removing Silver subscription");

    }

    @Override
    public void updateSubscription(Customer customer) {
        database.removeSubscription(customer.id);
        database.addSubscription(customer.id, "SILVER");
        System.out.println("Updating Silver subscription");

    }

}
