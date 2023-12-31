package org.example.behavioral_patterns.observer;

import org.example.util.CommonUtils;

public class EmailAlertsListener implements EventListeners {

    @Override
    public void update(String filename) {
        CommonUtils.display("Updating in EmailAlertsListener now, filename: " + filename);
    }
}
