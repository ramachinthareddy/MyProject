package Java8Tasks;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
class Task22 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", "Electronics"));
        products.add(new Product("Shirt", "Clothing"));
        products.add(new Product("TV", "Electronics"));
        products.add(new Product("Shoes", "Footwear"));

        Predicate<Product> electronicsPredicate = product -> product.getCategory().equals("Electronics");

        for (Product product : products) {
            if (electronicsPredicate.test(product)) {
                System.out.println(product.getName());
            }
        }
    }


    static class Product {
        private String name;
        private String category;

        public Product(String name, String category) {
            this.name = name;
            this.category = category;
        }

        public String getName() {
            return name;
        }

        public String getCategory() {
            return category;
        }
    }
}