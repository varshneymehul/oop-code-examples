package factory;
import factory.factories.*;
public class MainApp {

    /*
     * Video Reference: https://youtu.be/EdFq_JIThqM
     */
    public static void main(String[] args) {

        Restaurant orientalRestaurant = new OrientalRestaurant();
        orientalRestaurant.orderBurger();

        System.out.println("==========================================");

        Restaurant classicRestaurant = new ClassicRestaurant();
        classicRestaurant.orderBurger();

    }

}