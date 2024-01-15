package org.example.a_creational_patterns.d_abstract_factory;

import org.example.a_creational_patterns.d_abstract_factory.component.Button;
import org.example.a_creational_patterns.d_abstract_factory.component.CheckBox;

public class Application {
    GUIFactory factory;

    Application(GUIFactory factory) {
        this.factory = factory;
    }

    void clickAllUI() {
        Button button = factory.createButton();
        CheckBox checkBox = factory.createCheckBox();

        button.click();
        checkBox.check();
    }

}
