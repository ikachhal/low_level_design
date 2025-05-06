package lld.pizza_order_system;

public class PizzaPrepDemo {
    public static void run(){
        System.out.println("Pizza Prep Demo");

        BakePizza pizza = new TandooriPaneerPizza();
        PizzaPrep pizzaPrep = new PizzaPrep(pizza);
        pizzaPrep.preparePizza();
        System.out.println("Tandoori Paneer Pizza ready!");

        BakePizza pizza2 = new FarmHousePizza();
        PizzaPrep pizzaPrep2 = new PizzaPrep(pizza2);
        pizzaPrep2.preparePizza();
        System.out.println("Farm House Pizza ready!");

        System.out.println("Pizza Prep Demo End");
    }
}
