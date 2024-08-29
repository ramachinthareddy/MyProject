package src.Sweets;

public class Sweet extends Confectionery{
    private String flavor;

    public Sweet(String name, double weight, String flavor) {
        super(name, weight);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    @Override
    public String getType() {
        return "Sweet";
    }

}
