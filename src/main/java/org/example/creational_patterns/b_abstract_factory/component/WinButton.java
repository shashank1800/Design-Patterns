package org.example.creational_patterns.b_abstract_factory.component;

import org.example.util.CommonUtils;

public class WinButton implements Button {
    @Override
    public void click() {
        CommonUtils.display("Win Button clicked");
    }
}
