package org.example.c_behavioral_patterns.a_observer;

import org.example.util.CommonUtils;

public class Editor {
    private EventManager eventManager;

    public Editor() {
        this.eventManager = new EventManager();

        this.eventManager.subscribe("open", new LoggingListener());
        this.eventManager.subscribe("save", new EmailAlertsListener());
    }

    public void openFile() {
        CommonUtils.display("Open File");

        this.eventManager.notify("open", "Test.jpg");
    }

    public void saveFile() {
        CommonUtils.display("Save File");

        this.eventManager.notify("save", "Test.jpg");
    }

}
