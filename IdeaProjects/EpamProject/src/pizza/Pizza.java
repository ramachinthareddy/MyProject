package src.pizza;

import java.util.List;

public class Pizza {
    private String base;
    private List<String> toppings;

    public Pizza(String base, List<String> toppings) {
        this.base = base;
        this.toppings = toppings;
    }

    public double calculateCost() {
        PizzaShop pizzaShop = new PizzaShop();
        double baseCost = pizzaShop.calculatePizzaCost(base, toppings);
        return baseCost;
    }

}

