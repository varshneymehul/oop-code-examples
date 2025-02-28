package composite.products;

import composite.Box;

public abstract class Product implements Box {

    protected final String title;
    protected final double price;

    public Product(String title, double price) {
        this.title = title;
        this.price = price;
    }

    // Getters for accessing title and price
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    // Abstract methods (if needed, depending on Box)
    @Override
    abstract public double calculatePrice();
}