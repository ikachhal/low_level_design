package lld.factory_pattern;

public interface Subscription {
    public String getSubscriptionType();
    public void addSubscription(Customer customer);
    public void removeSubscription(Customer customer);
    public void updateSubscription(Customer customer);
}
