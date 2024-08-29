package src.Sweets;

public class Chocolate extends Confectionery{
    private String brand;

    public Chocolate(String name, double weight, String brand) {
        super(name, weight);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String getType() {
        return "Chocolate";
    }
}


