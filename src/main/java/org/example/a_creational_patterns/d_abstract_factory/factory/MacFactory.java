package org.example.a_creational_patterns.d_abstract_factory.factory;

import org.example.a_creational_patterns.d_abstract_factory.GUIFactory;
import org.example.a_creational_patterns.d_abstract_factory.component.Button;
import org.example.a_creational_patterns.d_abstract_factory.component.CheckBox;
import org.example.a_creational_patterns.d_abstract_factory.component.MacButton;
import org.example.a_creational_patterns.d_abstract_factory.component.MacCheckBox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
