package org.example.b_structural_pattern.b_bridge_pattern;

import org.example.b_structural_pattern.b_bridge_pattern.bridges.Restaurant;
import org.example.b_structural_pattern.b_bridge_pattern.pizza.PepperoniPizza;
import org.example.b_structural_pattern.b_bridge_pattern.pizza.VegPizza;
import org.example.b_structural_pattern.b_bridge_pattern.restaurant.AmericanRestaurant;
import org.example.b_structural_pattern.b_bridge_pattern.restaurant.ItalianRestaurant;

public class Client {
    public static void main(String[] args) {
        Restaurant americanPepperoniPizza = new AmericanRestaurant(new PepperoniPizza());
        americanPepperoniPizza.prepareAndDeliver();

        Restaurant italianVegPizza = new ItalianRestaurant(new VegPizza());
        italianVegPizza.prepareAndDeliver();
    }
}
