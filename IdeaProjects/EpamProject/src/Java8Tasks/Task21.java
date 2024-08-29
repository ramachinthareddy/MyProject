package src.Java8Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Product {
    private String name,category;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public void Product1(String name, String category) {
        this.name = name;
        this.category = this.category;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public String getCategory() {
        return category;
    }
}

public class Task21 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product 1", 500));
        products.add(new Product("Product 2", 1500));
        products.add(new Product("Product 3", 2000));
        products.add(new Product("Product 4", 800));

        Predicate<Product> priceGreaterThan1000 = product -> product.getPrice() > 1000;

        for (Product product : products) {
            if (priceGreaterThan1000.test(product)) {
                System.out.println(product.getName() + " - " + product.getPrice());
            }
        }
    }
}