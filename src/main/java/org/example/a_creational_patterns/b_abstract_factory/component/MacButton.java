package org.example.a_creational_patterns.b_abstract_factory.component;

import org.example.util.CommonUtils;

public class MacButton implements Button {
    @Override
    public void click() {
        CommonUtils.display("Mac Button clicked");
    }
}
