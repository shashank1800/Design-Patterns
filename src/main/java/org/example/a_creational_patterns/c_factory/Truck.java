package org.example.a_creational_patterns.c_factory;

import org.example.util.CommonUtils;

public class Truck implements Transport {
    @Override
    public void deliver() {
        CommonUtils.display("Delivered by Truck");
    }
}
