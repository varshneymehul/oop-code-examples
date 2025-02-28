package abstractFactory.factories;
import abstractFactory.products.*;

public abstract class Restaurant {
    // Business logic can be added here or in another class
    public abstract Burger createBurger();
    public abstract Pizza createPizza();

}
