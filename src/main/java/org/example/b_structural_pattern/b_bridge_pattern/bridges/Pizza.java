package org.example.b_structural_pattern.b_bridge_pattern.bridges;

import org.example.util.CommonUtils;

public abstract class Pizza {
    private String sauce;
    private String crust;

    public abstract void deliver();

    public void setSauce(String sauce) {
        this.sauce = sauce;
        CommonUtils.display("Adding", sauce, "sauce");
    }

    public void setCrust(String crust) {
        this.crust = crust;
        CommonUtils.display("Making", crust, "crust");
    }
}
