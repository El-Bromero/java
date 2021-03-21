package java_4.testing;

public class Product {
    private String name;
    private double price;
    private String type;
    private boolean isImported;

    public Product(String name, double price, String type, boolean isImported) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.isImported = isImported;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public boolean isImported() {
        return isImported;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
