package abstractFactory.factories;
import abstractFactory.products.*;
public class OrientalRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        return new OrientalBurger();
    }

    @Override
    public Pizza createPizza() {
        return new OrientalPizza();
    }

}