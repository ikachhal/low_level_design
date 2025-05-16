package lld.factory_pattern;

public class Customer {
    public String id;
    public Subscription subscription;

    public Customer(String id) {
        this.id = id;
    }

    public void SubscribePlan(Subscription subscription) {
        this.subscription = subscription;
        this.subscription.addSubscription(this);
    }

    public void unSubscribePlan() {
        subscription.removeSubscription(this);
    }

    public void updateSubcribePlan(Subscription newSubscription) {
        this.subscription.updateSubscription(this);
    }
}
