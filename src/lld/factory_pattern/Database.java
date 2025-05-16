package lld.factory_pattern;

import java.util.HashMap;

public class Database {
    private HashMap<String, String> subscriptions;

    public Database() {
        subscriptions = new HashMap<>();
    }

    public void addSubscription(String customerId, String subscriptionType) {
        subscriptions.put(customerId, subscriptionType);
        System.out.println("Adding subscription for customer: " + customerId + ", type: " + subscriptionType);
    }

    public String getSubscription(String customerId) {
        return subscriptions.get(customerId);
    }

    public void removeSubscription(String CustomerId) {
        subscriptions.remove(CustomerId);
    }
}
