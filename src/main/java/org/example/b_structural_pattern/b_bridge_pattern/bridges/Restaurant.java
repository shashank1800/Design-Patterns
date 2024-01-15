package org.example.b_structural_pattern.b_bridge_pattern.bridges;

import org.example.util.CommonUtils;

public abstract class Restaurant {

    public Pizza pizza;

    public Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }

    protected abstract void addSauce();
    protected abstract void makeCrust();


    public Pizza getPizza() {
        return pizza;
    }

    public void prepareAndDeliver() {
        CommonUtils.display("Preparing Pizza");
        addSauce();
        makeCrust();

        pizza.deliver();
    }


}