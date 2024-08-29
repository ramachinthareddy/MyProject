package src.Java8Tasks;
import java.util.ArrayList;
import java.util.List;


public class Task23 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Laptop", "Electronics", 150.0));
        productList.add(new Product("Mobile", "Electronics", 200.0));
        productList.add(new Product("Headphones", "Electronics", 50.0));
        productList.add(new Product("Shirt", "Clothing", 80.0));

        for (Product product : productList) {
            if (product.getCategory().equals("Electronics") && product.getPrice() > 100.0) {
                System.out.println(product.getName());
            }
        }
    }
    static class Product {
        private String name;
        private String category;
        private double price;

        public Product(String name, String category,double price) {
            this.name = name;
            this.category = category;
            this.price=price;
        }

        public String getName() {
            return name;
        }

        public String getCategory() {
            return category;
        }
        public double getPrice() {
            return price;
        }
    }
}