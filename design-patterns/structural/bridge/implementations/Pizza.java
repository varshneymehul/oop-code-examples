package bridge.implementations;

import java.util.Objects;

public abstract class Pizza {
    
    protected String sauce;
    protected String toppings;
    protected String crust;

    public Pizza() {}

    public Pizza(String sauce, String toppings, String crust) {
        this.sauce = sauce;
        this.toppings = toppings;
        this.crust = crust;
    }

    // Getters and Setters
    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    // Abstract methods
    public abstract void assemble();
    public abstract void qualityCheck();

    // toString method
    @Override
    public String toString() {
        return "Pizza{" +
                "sauce='" + sauce + '\'' +
                ", toppings='" + toppings + '\'' +
                ", crust='" + crust + '\'' +
                '}';
    }

    // equals and hashCode for object comparison
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return Objects.equals(sauce, pizza.sauce) &&
               Objects.equals(toppings, pizza.toppings) &&
               Objects.equals(crust, pizza.crust);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sauce, toppings, crust);
    }
}