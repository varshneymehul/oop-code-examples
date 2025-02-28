package abstractFactory;

import abstractFactory.factories.ClassicRestaurant;
import abstractFactory.factories.OrientalRestaurant;
import abstractFactory.factories.Restaurant;
import abstractFactory.products.Burger;
import abstractFactory.products.Pizza;

public class MainApp {
	/*
	 * Video Reference: https://youtu.be/QNpwWkdFvgQ
	 */
	public static void main(String[] args) {

		Restaurant orientalRestaurant = new OrientalRestaurant();
		Restaurant classicRestaurant = new ClassicRestaurant();

		Pizza classicPizza = classicRestaurant.createPizza();
		Burger classicBurger = classicRestaurant.createBurger();
		Pizza orientalPizza = orientalRestaurant.createPizza();
		Burger orientalBurger = orientalRestaurant.createBurger();
		
	}

}
