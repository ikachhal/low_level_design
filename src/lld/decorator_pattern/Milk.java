package lld.decorator_pattern;

public class Milk extends CoffeeDecorator{
    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}
