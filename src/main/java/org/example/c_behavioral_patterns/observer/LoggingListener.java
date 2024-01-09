package org.example.c_behavioral_patterns.observer;

import org.example.util.CommonUtils;

public class LoggingListener implements EventListeners {
    @Override
    public void update(String filename) {
        CommonUtils.display("Updating in LoggingListener now, filename: " + filename);
    }
}
