package org.example.b_structural_pattern.b_bridge_pattern.restaurant;

import org.example.b_structural_pattern.b_bridge_pattern.bridges.Pizza;
import org.example.b_structural_pattern.b_bridge_pattern.bridges.Restaurant;

public class AmericanRestaurant extends Restaurant {

    public AmericanRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    protected void addSauce() {
        getPizza().setSauce("tomato");
    }

    @Override
    protected void makeCrust() {
        getPizza().setCrust("thick");
    }
}
