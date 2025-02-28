package bridge;

import bridge.abstractions.AmericanRestaurant;
import bridge.abstractions.ItalianRestaurant;
import bridge.abstractions.Restaurant;
import bridge.implementations.PepperoniPizza;
import bridge.implementations.VeggiePizza;

public class MainApp {

    /*
     * Video Reference: https://youtu.be/88kAIisOiYs
     */
    public static void main(String[] args) {

        Restaurant americanRestaurant = new AmericanRestaurant(new PepperoniPizza());
        americanRestaurant.deliver();

        System.out.println("==========================================");

        Restaurant italianRestaurant = new ItalianRestaurant(new VeggiePizza());
        italianRestaurant.deliver();

    }

}
