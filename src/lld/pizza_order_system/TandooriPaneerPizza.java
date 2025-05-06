package lld.pizza_order_system;

public class TandooriPaneerPizza implements BakePizza {
    public Pizza pizza;
    TandooriPaneerPizza() {
        pizza = new Pizza();
    }
    @Override
    public void makeDough() {
        pizza.setDough("Wheat");
        System.out.println("Making dough for Tandoori Paneer Pizza");
    }

    @Override
    public void addSauce() {
        pizza.setSauce("Tomato + Mushroom");
        System.out.println("Adding sauce for Tandoori Paneer Pizza");
    }

    @Override
    public void addToppings() {
        pizza.setToppings("Onion, Capsicum, Tomato");
        System.out.println("Adding toppings for Tandoori Paneer Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Tandoori Paneer Pizza");
    }
}
