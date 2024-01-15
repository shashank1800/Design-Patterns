package org.example.a_creational_patterns.d_abstract_factory;

import org.example.a_creational_patterns.d_abstract_factory.component.Button;
import org.example.a_creational_patterns.d_abstract_factory.component.CheckBox;

public interface GUIFactory {
    Button createButton();

    CheckBox createCheckBox();
}
