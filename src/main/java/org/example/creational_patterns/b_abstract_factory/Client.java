package org.example.creational_patterns.b_abstract_factory;

import org.example.creational_patterns.b_abstract_factory.factory.MacFactory;
import org.example.creational_patterns.b_abstract_factory.factory.WinFactory;

public class Client {

    enum OS {MAC, WIN;}

    private static OS systemEnv = OS.WIN;

    public static void main(String[] args) {
        GUIFactory factory = null;

        switch (systemEnv) {
            case WIN:
                factory = new WinFactory();
                break;
            case MAC:
                factory = new MacFactory();
                break;
        }

        Application application = new Application(factory);
        application.clickAllUI();
    }
}
