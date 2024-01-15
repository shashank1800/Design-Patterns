package org.example.a_creational_patterns.d_abstract_factory;

import org.example.a_creational_patterns.d_abstract_factory.factory.MacFactory;
import org.example.a_creational_patterns.d_abstract_factory.factory.WinFactory;

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
