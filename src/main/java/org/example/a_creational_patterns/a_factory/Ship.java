package org.example.a_creational_patterns.a_factory;

import org.example.util.CommonUtils;

public class Ship implements Transport {
    @Override
    public void deliver() {
        CommonUtils.display("Delivered by Ship");
    }
}
