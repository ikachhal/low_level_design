package lld.decorator_pattern;

public class SimpleCoffee implements Coffee {


    public double cost() {
        return 2.0;
    }

    public String getDescription() {
        return "Simple Coffee";
    }
}
