package org.example.b_structural_pattern.b_bridge_pattern.pizza;

import org.example.b_structural_pattern.b_bridge_pattern.bridges.Pizza;
import org.example.util.CommonUtils;

public class VegPizza extends Pizza {

    @Override
    public void deliver() {
        CommonUtils.display("Delivering Veg Pizza");
    }
}
