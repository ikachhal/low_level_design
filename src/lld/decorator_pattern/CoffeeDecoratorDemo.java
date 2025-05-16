package lld.decorator_pattern;

public class CoffeeDecoratorDemo {
    public static void run() {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $" + coffee.cost());

        Coffee milkCoffee = new Milk(coffee);
        System.out.println(milkCoffee.getDescription() + " $" + milkCoffee.cost());

        Coffee sugarMilkCoffee = new Sugar(milkCoffee);
        System.out.println(sugarMilkCoffee.getDescription() + " $" + sugarMilkCoffee.cost());
    }
}
