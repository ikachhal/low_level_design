package lld.decorator_pattern;

public class Sugar extends CoffeeDecorator {
    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.2;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }
}
