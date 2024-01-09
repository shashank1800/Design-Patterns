package org.example.b_structural_pattern.b_bridge_pattern.restaurant;

import org.example.b_structural_pattern.b_bridge_pattern.bridges.Pizza;
import org.example.b_structural_pattern.b_bridge_pattern.bridges.Restaurant;

public class ItalianRestaurant extends Restaurant {
    public ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    protected void addSauce() {
        getPizza().setSauce("chilli");
    }

    @Override
    protected void makeCrust() {
        getPizza().setCrust("thin");
    }
}
