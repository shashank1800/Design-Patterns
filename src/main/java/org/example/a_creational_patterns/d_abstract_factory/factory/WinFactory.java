package org.example.a_creational_patterns.d_abstract_factory.factory;

import org.example.a_creational_patterns.d_abstract_factory.GUIFactory;
import org.example.a_creational_patterns.d_abstract_factory.component.Button;
import org.example.a_creational_patterns.d_abstract_factory.component.CheckBox;
import org.example.a_creational_patterns.d_abstract_factory.component.WinButton;
import org.example.a_creational_patterns.d_abstract_factory.component.WinCheckBox;

public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
