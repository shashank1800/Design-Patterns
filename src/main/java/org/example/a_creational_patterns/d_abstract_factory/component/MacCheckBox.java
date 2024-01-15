package org.example.a_creational_patterns.d_abstract_factory.component;

import org.example.util.CommonUtils;

public class MacCheckBox implements CheckBox {
    @Override
    public void check() {
        CommonUtils.display("Mac Button checked");
    }
}
