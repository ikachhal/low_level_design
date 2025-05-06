package lld.pizza_order_system;

public class FarmHousePizza implements BakePizza {
    public Pizza pizza;
    FarmHousePizza() {
        pizza = new Pizza();
    }
    @Override
    public void makeDough() {
        pizza.setDough("Wheat");
        System.out.println("Making dough for Farm House Pizza");
    }

    @Override
    public void addSauce() {
        pizza.setSauce("Tomato");
        System.out.println("Adding sauce for Farm House Pizza");
    }

    @Override
    public void addToppings() {
        pizza.setToppings("Onion, Capsicum, Tomato");
        System.out.println("Adding toppings for Farm House Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Farm House Pizza");
    }
}
