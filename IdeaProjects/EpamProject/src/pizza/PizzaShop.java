package pizza;

import java.util.ArrayList;
import java.util.List;
public class PizzaShop {


    private List<String> availableBases;
    private List<String> availableToppings;

    public PizzaShop() {
        availableBases = new ArrayList<>();
        availableToppings = new ArrayList<>();
    }

    public void addBase(String base) {
        availableBases.add(base);
    }

    public void addTopping(String topping) {
        availableToppings.add(topping);
    }

    public double calculatePizzaCost(String base, List<String> toppings) {
        double baseCost = 0.0;
        double toppingsCost = 0.0;

        // Calculate the cost of the selected base
        switch (base) {
            case "Standard":
                baseCost = 8.99;
                break;
            case "Soft":
                baseCost = 9.99;
                break;
            default:
                System.out.println("Invalid base selection");
                return 0.0; // Return 0 if an invalid base is selected
        }

        // Calculate the cost of the selected toppings
        for (String topping : toppings) {
            switch (topping) {
                case "Tomato":
                    toppingsCost += 1.99;
                    break;
                case "Corn":
                    toppingsCost += 0.99;
                    break;
                case "Mushrooms":
                    toppingsCost += 1.49;
                    break;
                default:
                    System.out.println("Invalid topping selection: " + topping);
                    return 0.0; // Return 0 if an invalid topping is selected
            }
        }

        // Calculate the total cost of the pizza
        double totalCost = baseCost + toppingsCost;
        return totalCost;
    }


    }