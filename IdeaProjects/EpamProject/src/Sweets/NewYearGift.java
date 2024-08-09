package Sweets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NewYearGift {
    private List<Confectionery> giftItems;

    public NewYearGift() {
        giftItems = new ArrayList<>();
    }

    public void addConfectionery(Confectionery confectionery) {
        giftItems.add(confectionery);
    }

    public double getTotalWeight() {
        double totalWeight = 0;
        for (Confectionery confectionery : giftItems) {
            totalWeight += confectionery.getWeight();
        }
        return totalWeight;
    }

    public void sortChocolatesByOption(Comparator<Chocolate> comparator) {
        List<Chocolate> chocolates = new ArrayList<>();
        for (Confectionery confectionery : giftItems) {
            if (confectionery instanceof Chocolate) {
                chocolates.add((Chocolate) confectionery);
            }
        }
        Collections.sort(chocolates, comparator);
        giftItems.removeAll(chocolates);
        giftItems.addAll(chocolates);
    }

    public List<Confectionery> getCandiesInRange(double minWeight, double maxWeight) {
        List<Confectionery> candiesInRange = new ArrayList<>();
        for (Confectionery confectionery : giftItems) {
            if (confectionery instanceof Sweet && confectionery.getWeight() >= minWeight && confectionery.getWeight() <= maxWeight) {
                candiesInRange.add(confectionery);
            }
        }
        return candiesInRange;
    }

    public static void main(String[] args) {
        NewYearGift gift = new NewYearGift();

        // Adding chocolates and sweets to the gift
        gift.addConfectionery(new Chocolate("KitKat", 50, "Nestle"));
        gift.addConfectionery(new Chocolate("Dairy Milk", 100, "Cadbury"));
        gift.addConfectionery(new Sweet("Gummy Bears", 30, "Fruit"));
        gift.addConfectionery(new Sweet("Lollipop", 20, "Strawberry"));

        // Calculating the total weight of the gift
        double totalWeight = gift.getTotalWeight();
        System.out.println("Total weight of the gift: " + totalWeight + " grams");

        // Sorting the chocolates by brand
        gift.sortChocolatesByOption(Comparator.comparing(Chocolate::getBrand));
        System.out.println("Chocolates sorted by brand:");

        for (Confectionery confectionery : gift.giftItems) {
            if (confectionery instanceof Chocolate) {
                System.out.println(confectionery.getName() + " - " + ((Chocolate) confectionery).getBrand());
            }
        }

        // Finding candies within a specified weight range
        double minWeight = 20;
        double maxWeight = 50;
        List<Confectionery> candiesInRange = gift.getCandiesInRange(minWeight, maxWeight);
        System.out.println("Candies within weight range " + minWeight + " - " + maxWeight + " grams:");
        for (Confectionery confectionery : candiesInRange) {
            System.out.println(confectionery.getName() + " - " + confectionery.getWeight() + " grams");
        }
    }
}