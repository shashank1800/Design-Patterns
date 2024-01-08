package org.example.creational_patterns.b_abstract_factory;

import org.example.creational_patterns.b_abstract_factory.component.Button;
import org.example.creational_patterns.b_abstract_factory.component.CheckBox;

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
