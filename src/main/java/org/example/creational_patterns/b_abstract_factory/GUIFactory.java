package org.example.creational_patterns.b_abstract_factory;

import org.example.creational_patterns.b_abstract_factory.component.Button;
import org.example.creational_patterns.b_abstract_factory.component.CheckBox;

public interface GUIFactory {
    Button createButton();

    CheckBox createCheckBox();
}
