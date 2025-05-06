package lld.pizza_order_system;

public class PizzaPrep {
    public BakePizza pizza;

    PizzaPrep(BakePizza pizza) {
        this.pizza = pizza;
    }

    public void preparePizza() {
        pizza.makeDough();
        pizza.addSauce();
        pizza.addToppings();
        pizza.bake();
    }
}
