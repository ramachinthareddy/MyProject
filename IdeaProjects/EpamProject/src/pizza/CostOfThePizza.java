package src.pizza;

import java.util.ArrayList;
import java.util.List;

public class CostOfThePizza {
    public static void main(String[] args) {
        PizzaShop pizzaShop = new PizzaShop();
        pizzaShop.addBase("Standard");
        pizzaShop.addBase("Soft");
        pizzaShop.addTopping("Tomato");
        pizzaShop.addTopping("Corn");
        pizzaShop.addTopping("Mushrooms");

        List<String> toppings = new ArrayList<>();
        toppings.add("Tomato");
        toppings.add("Mushrooms");

        Pizza pizza = new Pizza("Standard", toppings);
        double cost = pizza.calculateCost();
        System.out.println("The cost of the pizza is: $" + cost);
    }

}
