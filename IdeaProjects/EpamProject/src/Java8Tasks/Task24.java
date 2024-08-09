package Java8Tasks;

import java.util.ArrayList;
import java.util.List;



public class Task24 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Laptop", 1500, "Electronics"));
        productList.add(new Product("Mobile", 800, "Electronics"));
        productList.add(new Product("Shirt", 50, "Clothing"));
        productList.add(new Product("TV", 1200, "Electronics"));
        productList.add(new Product("Watch", 200, "Accessories"));

        for (Product product : productList) {
            if (product.getPrice() > 100 || product.getCategory().equals("Electronics")) {
                System.out.println(product.getName());
            }
        }
    }
    static class Product {
        private String name;
        private double price;
        private String category;

        public Product(String name, double price, String category) {
            this.name = name;
            this.price = price;
            this.category = category;
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
}
