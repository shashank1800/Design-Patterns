package org.example.structural_pattern.c_decorator_pattern;


import org.example.util.CommonUtils;

public class BasicNotifier implements Notifier {
    @Override
    public void send() {
        CommonUtils.display("Notification Enabled");
    }
}
